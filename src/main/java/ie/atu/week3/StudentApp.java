package ie.atu.week3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < numOfStudents) {
            System.out.println("Enter name of student.");
            String name = scanner.nextLine();
            System.out.println("Enter email of student.");
            String email = scanner.nextLine();
            System.out.println("Enter ID of Student.");
            String id = scanner.nextLine();
            Student student = new Student(name, email, id);
            System.out.println(student);
            i++;
        }

    }
}
