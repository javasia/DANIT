package cw180704;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(scanInt(new Scanner(System.in).next(),-1));
    }

    private static Integer scanInt (String s, int errorCode){
        Integer result = null;
        try {
            result = Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.err.println(errorCode);
        }
        return result;
    }
}
