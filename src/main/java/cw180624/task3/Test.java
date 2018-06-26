package cw180624.task3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        INameDAO dao = new NameDAOImpTxt();
       dao.addName(new Name("Andrii", "Danchenko"));
       dao.addName(new Name("FFF", "NNN"));
       dao.addName(new Name("John", "Doe"));
        Name name = dao.getName();
        System.out.println(name);
    }
}