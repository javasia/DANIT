package cw180624.task3;
/*
implements DAO for TXT-file storage
*/

import java.io.*;
import java.util.TreeSet;

public class NameDAOImpTxt implements INameDAO {

    private File storage;

    public NameDAOImpTxt(String pathName) {
        this.storage = new File(pathName);
    }

    public NameDAOImpTxt() {
        this(new String("src/main/java/cw180624/task3/inputdata.txt"));
    }

    @Override
    public Name getName() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(storage));
        String line = reader.readLine();
        reader.close();
        String firstName = line.split(" ")[0];
        String secondName = line.split(" ")[1];
        return new Name(firstName, secondName);
    }

    @Override
    public TreeSet<Name> getAllNames() {
        return null;
    }

    @Override
    public void addName(Name name) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(storage)));
        writer.write(name.toString());
        writer.close();
    }

    @Override
    public void addAllNames(TreeSet<Name> names) {

    }
}

