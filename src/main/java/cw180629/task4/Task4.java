package cw180629.task4;
import global.utils.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {

        CategoriesManager categoriesManager = new CategoriesManager();

        new FileReader<ArrayList<String>>(new File("src/main/java/cw180629/task4/resources", "data3.txt")).get()
                .stream()
                .map(s -> new CategoryRecord(s.split(":")[1], Enum.valueOf(Categories.class, s.split(":")[0])))
                .forEach(categoriesManager::add);
        System.out.println(categoriesManager.toString());
    }
}
