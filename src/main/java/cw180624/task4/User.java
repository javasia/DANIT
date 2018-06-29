package cw180624.task4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class User implements Comparable<User> {
    public static long id;
    private String name;
    private Calendar year = new GregorianCalendar();
    private double salary;
    private final long USER_ID;


    public User(String name, int year, double salary) {
        this.USER_ID = this.id++;
        this.name = name;
        this.year.set(Calendar.YEAR, year);
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Calendar getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }

    public long getUSER_ID() {
        return USER_ID;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nYear: %d\nSalary: %.2f", name, year.get(Calendar.YEAR), salary);
    }

    @Override
    public int compareTo(User other) {
        return (int) (this.salary - other.salary);
    }
}