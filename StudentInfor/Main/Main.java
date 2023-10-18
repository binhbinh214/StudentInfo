package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.StudentManagement;
import model.Student;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        StudentManagement controller = new StudentManagement();
        Menu view = new Menu();
        Scanner scanner = new Scanner(System.in);

        view.inputStudentData(scanner, students);
        controller.sortStudents(students);
        controller.displayStudents(students);

        scanner.close();
    }
}