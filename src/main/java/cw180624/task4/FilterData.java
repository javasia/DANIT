package cw180624.task4;

import java.util.List;
import java.util.TreeMap;

public class FilterData {
    List<String> input;

    public FilterData(List<String> input) {
        this.input = input;
    }

    public TreeMap<Long, User> filter() {
        return filter(input);
    }

    public TreeMap<Long, User> filter(List<String> input) {
        TreeMap<Long, User> output = new TreeMap<>();
        for (int i = 0; i < input.size(); i += 3) {
            String nameHeader = "Name:";
            String yearHeader = "Year:";
            String salaryHeader = "Salary:";
            String name = input.get(i);
            String year = input.get(i + 1);
            String salary = input.get(i + 2);

            if (name == null || year == null || salary == null) {
                throw new NullPointerException("Same data are missing!");
            }
            if (name.matches(nameHeader + ".+")) {
                name = name.substring(nameHeader.length());
            } else {
                throw new IllegalArgumentException(String.format("\"%s\" record does not match the agreed pattern.", nameHeader));
            }
            if (year.matches(yearHeader + "\\d{4}")) {
                year = name.substring(yearHeader.length());
            } else {
                throw new IllegalArgumentException(String.format("\"%s\" record does not match the agreed pattern.", yearHeader));
            }
            if (salary.matches(salaryHeader + "\\d+")) {
                salary = salary.substring(yearHeader.length());
            } else {
                throw new IllegalArgumentException(String.format("\"%s\" record does not match the agreed pattern.", salaryHeader));
            }
            User newUser = new User(name, Integer.parseInt(year), Double.parseDouble(salary));
            output.put(newUser.getUSER_ID(), newUser);
        }
        return output;
    }
}
