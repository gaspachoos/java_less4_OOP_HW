package controller;


import model.Teacher;
import service.TeacherGroupService;
import view.TeacherView;

import java.util.List;

public class TeacherGroupController {


    private TeacherView teacherView = new TeacherView();

    public TeacherGroupController(TeacherView teacherView) {
        this.teacherView = teacherView;
    }

    public void sendOnConsole(List<Teacher> teachers) {
        teacherView.sendOnConsole(teachers);
    }

    private TeacherGroupService service;

    public TeacherGroupController(TeacherGroupService service) {
        this.service = service;
    }

    public void addTeacher(Teacher teacher){
        service.addTeacher(teacher);
    }

}
