package arraySortII;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("4 300 250 400 100");
        int N = in.nextInt();
        ArrayList<Employee> employees = new ArrayList(N);
        for (int i = 0; i < N; i++) {
            employees.add(new Employee(i, in.nextInt()));
        }
        employees.sort(Comparator.comparingInt(e2 -> e2.salary));
        employees.forEach(e -> System.out.printf("%d ", e.id));
    }

    static class Employee{
        private int id;
        private int salary;
        Employee(int id, int salary) {
            this.id = id;
            this.salary = salary;
        }
    }
}