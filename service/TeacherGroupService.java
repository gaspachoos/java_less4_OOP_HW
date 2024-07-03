package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.TeacherGroup;

import java.util.Collections;
import java.util.List;

public class TeacherGroupService {

    private TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public void addTeacher(Teacher teacher) {
        teacherGroup.teachers.add(teacher);
        System.out.println("Teacher added to group successfully. ");
    }

    public List<Teacher> sort(){
        Collections.sort(teacherGroup.teachers);
        return teacherGroup.teachers;
    }
}
