package cw180624;

/*
2. Дана строка из слов.
Необходимо пройтись по строке, и произвести следущие операции:
Первую букву для всех слов, которые длинее одного символа сделать большой
остальные сделать маленькими вне зависимости от того такими они были.
*/

public class Task2 {

    private String[] data;

    public Task2(String data) {
        this.data = data.split(" {1}");
    }

    public void solve() {
        StringBuilder res = new StringBuilder();
        for (String s: data){
            if (s.matches("\\w{2,}.*")){
                res.append(Character.toUpperCase(s.charAt(0)));
                res.append(s.substring(1));
            }else {
                res.append(s);
            }
            res.append(" ");
        }
        System.out.println(res);
    }

}

