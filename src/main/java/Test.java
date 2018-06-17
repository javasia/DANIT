import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = null;
        ArrayList<String> strings = new ArrayList<>();
        try {
            sc = new Scanner(new File("src\\main\\java", "input.txt"));
            while (sc.hasNextLine()){
                strings.add(sc.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            sc.close();
        }
       // strings.sort((e1, e2) -> e1.length() - e2.length());
        strings.sort(Comparator.comparingInt(String::length));
      //  strings.forEach(s -> System.out.println(s));
        strings.forEach(System.out::println);
      //  LinkedList<String> collect = new ArrayList<String>().stream().collect(Collectors.toCollection(LinkedList::new));
    }


}