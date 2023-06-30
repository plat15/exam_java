package model;

import javax.swing.text.Style;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {


    private String Batch;
    private static double Mark1;
    private static double Mark2;

    private static double AvgMark;

    public Student() {
    }

    public Student(int id, String name, String numberPhone, String address, String batch, double mark1, double mark2, double avgMark) {
        super(id, name, numberPhone, address);
        Batch = batch;
        Mark1 = mark1;
        Mark2 = mark2;
        AvgMark = avgMark;
    }

    public static double getAvgMark() {
        return AvgMark = ((Mark1 +Mark2)/2);
    }

    public void setAvgMark(double avgMark) {
        AvgMark = avgMark;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public double getMark1() {
        return Mark1;
    }

    public void setMark1(double mark1) {
        Mark1 = mark1;
    }

    public double getMark2() {
        return Mark2;
    }

    public void setMark2(double mark2) {
        Mark2 = mark2;
    }

    public void input(Scanner scanner) {
        System.out.println("ID");
        super.setId(scanner.nextInt());
        System.out.println("NAME");
        super.setName(scanner.next());
        System.out.println("PHONE");
        super.setNumberPhone(scanner.next());
        System.out.println("ADDRESS");
        super.setAddress(scanner.next());
        scanner.nextLine();
        System.out.println("Batch");
        setBatch(scanner.next());
        System.out.println("Mark1");
        setMark1(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Mark2");
        setMark2(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public double getSalary() {
        return 0;
    }

    public void show() {
        System.out.println("----------------STUDENT----------------");
        System.out.println("ID  ----->" + getId());
        System.out.println("NAME    ----->" + getName());
        System.out.println("PHONE    ----->" + getNumberPhone());
        System.out.println("ADDRESS   ----->" + getAddress());
        System.out.println("BATCH   ----->" + getBatch());
        System.out.println("MARK1   ----->" + getMark1());
        System.out.println("MARK2   ----->" + getMark2());
        System.out.println("AVGMARK    ----->" + getAvgMark());
        System.out.println("---------------------------------------");

    }
}
