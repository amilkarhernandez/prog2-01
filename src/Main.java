import entities.Student;
import services.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();

        int option;

        do {
            System.out.println("\n===== MENÚ ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar todos los estudiantes");
            System.out.println("3. Eliminar estudiante por código");
            System.out.println("4. Calcular promedio de notas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    registerStudents(sc, studentService);
                    break;

                case 2:
                    studentService.listAll();
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (option != 0);

        sc.close();


        /*


        studentService.listAll();
        System.out.println("----------->-------------");
        System.out.println("Ingrese El estudiante a buscar: ");
        Long id = sc.nextLong();

        Student s = studentService.findOne(id);
        System.out.println("Id: "+  s.getId());
        System.out.println("Nombre:" + s.getName());

         */
    }

    private static void registerStudents(Scanner sc, StudentService service){
        Student studentEmpty = addStudent(sc);
        service.create(studentEmpty);
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