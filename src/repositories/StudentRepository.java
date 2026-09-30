package repositories;


import entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> list = new ArrayList<>();

    public Student createStudent(Student student){
        list.add(student);
        return student;
    }

    public List<Student> listAll(){
        return list;
    }

    public void listAllStudent(){
        System.out.println(list);
    }

    public Student findOne(Long id){
        Student find = new Student();
        for(Student student: list){
            //if(student.getId() == id) return student;
            if(student.getId().equals(id)){
                find = student;
            }
        }
        return find;
    }

    public Student findOneList(Long id){
        return (Student) list.stream().filter(s -> s.getId().equals(id));
    }

    public Long generateId(){
        return list.size() + 1L;
    }

}
