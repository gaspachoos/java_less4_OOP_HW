package controller;

import model.Student;
import model.User;
import service.StudentService;
import view.StudentView;
import view.UserView;

import java.util.List;

public class StudentController implements UserController {


    StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @Override
    public <T extends User> Student create() {
        StudentService service = new StudentService();
        return service.createStudent();
    }


}
