package controller;

import java.util.Collections;
import java.util.List;

import model.Student;
import model.StudentComparator;

public class StudentManagement {
    public List<Student> sortStudents(List<Student> students) {
        Collections.sort(students, new StudentComparator());
        return students;
    }

    public void displayStudents(List<Student> students) {
        int studentNumber = 1;
        for (Student student : students) {
            System.out.println("-------------Student " + studentNumber + "-------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClasses());
            System.out.println("Mark: " + student.getMark());
            System.out.println();
            studentNumber++;
        }
    }
}

