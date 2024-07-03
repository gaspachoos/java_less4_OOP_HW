import controller.*;
import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.TeacherGroup;
import service.StudentGroupService;
import service.StudentService;
import service.TeacherGroupService;
import service.TeacherService;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;


public class Less_4 {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        StudentController studentController = new StudentController(studentService);
        List<Student> students = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(students);
        StudentGroupService studentGroupService = new StudentGroupService(studentGroup);
        StudentGroupController studentGroupController = new StudentGroupController(studentGroupService);
        studentGroupController.addStudent(studentController.create());
        studentGroupController.sendOnConsole(students);


        TeacherService teacherService = new TeacherService();
        TeacherController teacherController = new TeacherController(teacherService);
        List<Teacher> teachers = new ArrayList<>();
        TeacherGroup teacherGroup = new TeacherGroup(teachers);
        TeacherGroupService teacherGroupService = new TeacherGroupService(teacherGroup);
        TeacherGroupController teacherGroupController = new TeacherGroupController(teacherGroupService);
        teacherGroupController.addTeacher(teacherController.create());
        teacherGroupController.sendOnConsole(teachers);
    }

}