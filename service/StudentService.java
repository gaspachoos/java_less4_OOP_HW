package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    public Student createStudent() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student lastName: ");
        String lastName = scanner.nextLine();

        System.out.println("The student's registration was successful: ");
        return new Student(id,name,lastName);
    }
}
