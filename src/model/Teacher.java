package model;

import java.util.Scanner;

public class Teacher extends Person{

    private static final int SALARY_YEAR = 800000;
    private double salary;
    private int numberWorkDay;

    public Teacher() {
    }

    public Teacher(int id, String name, String numberPhone, String address, double salary, int numberWorkDay) {
        super(id, name, numberPhone, address);
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    @Override
    public double getSalary() {
        return salary = numberWorkDay * SALARY_YEAR;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
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
        System.out.println("YEAR WORKING");
        setNumberWorkDay(scanner.nextInt());
        setSalary(getSalary());
    }

    public void show() {
        System.out.println("----------------TEACHER----------------");
        System.out.println("ID  ----->" + getId());
        System.out.println("NAME    ----->" + getName());
        System.out.println("PHONE    ----->" + getNumberPhone());
        System.out.println("ADDRESS   ----->" + getAddress());
        System.out.println("YEAR WORKING   ----->" + getNumberWorkDay());
        System.out.println("SALARY    ----->" + getSalary());
        System.out.println("---------------------------------------");

    }
}