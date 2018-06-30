package cw180624.task4.utils;

import cw180624.task4.User;

import java.util.List;
import java.util.PriorityQueue;

public class FilterData {
    private List<String> input;

    public FilterData(List<String> input) {
        this.input = input;
    }

    public PriorityQueue<User> filter() {
        return filter(input);
    }

    public PriorityQueue<User> filter(List<String> input) {
        PriorityQueue<User> output = new PriorityQueue<>();
        for (int i = 0; i < input.size()-2; i += 3) {
            String nameHeader = "Name:";
            String yearHeader = "Year:";
            String salaryHeader = "Salary:";
            String name = input.get(i);
            String year = input.get(i + 1);
            String salary = input.get(i + 2);

            if (name == null || year == null || salary == null) {
                throw new NullPointerException("Some data are missing!");
            }
            if (name.matches(nameHeader + "\\w+")) {
                name = name.substring(nameHeader.length());
            } else {
                throw new IllegalArgumentException(String.format("\"%s\" record does not match the agreed pattern.", nameHeader));
            }
            if (year.matches(yearHeader + "\\d{4}")) {
                year = year.substring(yearHeader.length());
            } else {
                throw new IllegalArgumentException(String.format("\"%s\" record does not match the agreed pattern.", yearHeader));
            }
            if (salary.matches(salaryHeader + "\\d+")) {
                salary = salary.substring(salaryHeader.length());
            } else {
                throw new IllegalArgumentException(String.format("\"%s\" record does not match the agreed pattern.", salaryHeader));
            }
            User newUser = new User(name, Integer.parseInt(year), Double.parseDouble(salary));
            output.add(newUser);
        }
        return output;
    }
}
