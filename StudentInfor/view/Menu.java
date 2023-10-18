package view;

import java.util.List;
import java.util.Scanner;

import model.Student;

public class Menu {
    public void inputStudentData(Scanner scanner, List<Student> students) {
        System.out.println("====== Collection Sort Program ======");
        System.out.println("Please input student information");

        //int studentCount = 1;
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Classes: ");
            String classes = scanner.nextLine();

            float mark;
            while (true) {
                System.out.print("Mark: ");
                String markStr = scanner.nextLine();
                try {
                    mark = Float.parseFloat(markStr);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid mark. Please enter a valid number.");
                }
            }

            students.add(new Student(name, classes, mark));

            System.out.print("Do you want to enter more student information? (Y/N): ");
            String moreInfo = scanner.nextLine();
            if (!moreInfo.equalsIgnoreCase("Y")) {
                break;
            }

            //studentCount++;
        }
    }
}
