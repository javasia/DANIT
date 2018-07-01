package cw180629.Task3;

/*
 3. Дана строка из слов.
Необходимо пройтись по строке и произвести следущие операции:
Перевернуть все слова задом на перед, и сделать первую букву большой, остальные - маленькие
Пример: Alex Hello -> Xela Olleh
*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String testString = "Alex Hello";
        String controlString = "Xela Olleh";
        System.out.println(solve(testString));
        assert solve(testString).equals(controlString);
    }

    public static String solve(String inputString) {
        StringBuilder res = new StringBuilder();
        Arrays.asList(inputString.split(" ")).forEach(str -> {
            res.append(new StringBuilder()
                    .append(Character.toUpperCase(new StringBuilder(str).reverse().toString().charAt(0)))
                    .append(new StringBuilder(str).reverse().toString().substring(1).toLowerCase())
                    .append(" ").toString());
        });
        return res.toString().trim();
    }
}
