package cw180704;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(Integer.parseInt(scanner.next()));
        }catch (Exception e){
            System.err.println(-1);
        }
    }
}
