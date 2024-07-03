package controller;

import model.Student;
import model.Teacher;
import model.User;
import service.TeacherService;


public class TeacherController implements UserController{


    TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @Override
    public <T extends User> Teacher create() {
        TeacherService service = new TeacherService();
        return service.createTeacher();
    }

}
