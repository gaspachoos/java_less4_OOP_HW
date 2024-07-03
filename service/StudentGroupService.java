package service;

import model.Student;
import model.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student) {
        studentGroup.students.add(student);
        System.out.println("Student added to group successfully. ");
    }

    public List<Student> sort(){
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }
}
