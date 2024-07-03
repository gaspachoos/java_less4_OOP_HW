package service;

import model.Teacher;

import java.util.Scanner;

public class TeacherService{

    public Teacher createTeacher() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter teacher id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter teacher name: ");
            String name = scanner.nextLine();

            System.out.println("Enter teacher lastName: ");
            String lastName = scanner.nextLine();

            System.out.println("The teacher's registration was successful: ");
            return new Teacher(id,name,lastName);
        }
    }

