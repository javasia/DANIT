package cw180704;


import global.utils.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = readFile("c:\\", "1.txt");
    }

    public static List<String> readFile(String parent, String name) {
        File file = new File(parent, name);
        List<String> res = null;
        try {
            res = new FileReader<ArrayList<String>>(file).get();
        } catch (FileNotFoundException e) {
            System.err.printf("File %s not found.", file.getAbsolutePath());
        }
        return res;
    }
}
