package utils;

import model.Person;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ManagerFunction {
    static List<Person> listEmployee = new ArrayList<>();

    public static void printMenu(){
        System.out.println("PRINT MENU");
        System.out.println("1. Input employee or teacher");
        System.out.println("2. Show full list of teachers or student.");
        System.out.println("3. Sort the teacher's name alphabetically.");
        System.out.println("4. Sort the student's name alphabetically");
        System.out.println("5. Exit");
    }
    public static void inputInf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT INF");
        System.out.println("1. Input Student");
        System.out.println("2. Input Teacher");
        int choose = scanner.nextInt();
        if (choose == 1) {
            Student student = new Student();
            student.input(scanner);
            listEmployee.add(student);
        } else {
            Teacher teacher = new Teacher();
            teacher.input(scanner);
            listEmployee.add(teacher);
        }
    }

    public static void showInf() {
        for (Person person : listEmployee) {
            if (person instanceof Teacher teacher) {
                teacher.show();
            } else if (person instanceof Student student) {
                student.show();
            } else {
                System.out.println("Please re-enter!");
            }
        }
    }
}
