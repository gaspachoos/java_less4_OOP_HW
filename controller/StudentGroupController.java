package controller;

import model.Student;
import service.StudentGroupService;
import view.StudentView;

import java.util.List;

public class StudentGroupController {
    private StudentView studentView = new StudentView();

    public StudentGroupController(StudentView studentView) {
        this.studentView = studentView;
    }

    public void sendOnConsole(List<Student> students) {
        studentView.sendOnConsole(students);
    }

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student){
        service.addStudent(student);
    }


}
