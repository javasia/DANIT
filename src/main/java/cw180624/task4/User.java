package cw180624.task4;

import cw180624.task4.interfaces.XmlPrintable;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class User implements Comparable<User>, XmlPrintable {
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

    public int getYear() {
        return year.get(Calendar.YEAR);
    }

    public double getSalary() {
        return salary;
    }

    public long getUSER_ID() {
        return USER_ID;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nYear: %d\nSalary: %.2f", getName(), getYear(), getSalary());
    }

    @Override
    public String toXmlString() {
        return String.format("<user><name>%s</name>\n<year>%d</year>\n<salary>%.2f</salary>\n</user>",
                getName(), getYear(), getSalary());
    }

    @Override
    public String getXmlHeader() {
        return new String("<users>");
    }

    @Override
    public String getXmlFooter() {
        return new String("</users>");
    }

    @Override
    public int compareTo(User other) {
        return (int) (this.getSalary() - other.getSalary());
    }

    @Override
    public boolean equals(Object obj) {
        User other = (User) obj;
        return this.USER_ID == other.USER_ID &&
                this.getName().equals(other.getName()) &&
                this.getSalary() == other.getSalary() &&
                this.getYear() == other.getYear();
    }
}