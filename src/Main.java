import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student studentEmpty = addStudent(sc);
        studentEmpty.setId(generateId());

        System.out.println("Name: "+studentEmpty.getName());
        System.out.println("Phone: "+studentEmpty.getPhone());
        System.out.println("Email: "+studentEmpty.getEmail());
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

    private static Long generateId(){
        Long cont = 0L;
        return cont + 1L;
    }
}