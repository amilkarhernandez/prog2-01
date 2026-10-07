package services;

import entities.Student;
import repositories.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public Student create(Student s){

        //Validations
        s.setId(generateId(studentRepository));

        if(!validateFields(s)){
            System.out.println("Hay campos que no se han llenado.");
        }else{
            return studentRepository.createStudent(s);
        }
       return null;
    }

    public void listAll(){

        try {
            int data = 0/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Ojo Entro por la Excepcion.");
        }

        studentRepository.listAllStudent();
    }

    public Student findOne(Long id){
        return studentRepository.findOne(id);
    }

    private Long generateId(StudentRepository studentRepository){
        return studentRepository.generateId();
    }

    private boolean validateFields(Student s){
        if(s.getName().isEmpty() || s.getEmail().isEmpty() || s.getGrade().isEmpty()
        || s.getPhone().isEmpty() || s.getSubject().isEmpty() || s.getNumberCard().isEmpty()
        || s.getGender().isEmpty()){
            return false;
        }
        return true;
    }

}
