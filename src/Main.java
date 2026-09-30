import entities.Student;
import services.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();

        Student studentEmpty = addStudent(sc);

        studentService.create(studentEmpty);

        studentService.listAll();
        System.out.println("----------->-------------");
        System.out.println("Ingrese El estudiante a buscar: ");
        Long id = sc.nextLong();

        Student s = studentService.findOne(id);
        System.out.println("Id: "+  s.getId());
        System.out.println("Nombre:" + s.getName());
    }

    private static Student addStudent(Scanner sc){
        Student student = new Student();

        System.out.println("Ingrese Nombre: ");
        student.setName(sc.nextLine());

        System.out.println("Ingrese Edad: ");
        student.setGender(sc.nextLine());

        System.out.println("Ingrese Telefono: ");
        student.setPhone(sc.nextLine());

        System.out.println("Ingrese Email: ");
        student.setEmail(sc.nextLine());

        System.out.println("Ingrese Numero de carnet: ");
        student.setNumberCard(sc.nextLine());

        System.out.println("Ingrese Semestre: ");
        student.setGrade(sc.nextLine());

        System.out.println("Ingrese la Materia: ");
        student.setSubject(sc.nextLine());

        return student;
    }


}