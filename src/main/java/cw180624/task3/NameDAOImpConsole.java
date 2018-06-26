package cw180624.task3;
/*
implements DAO for console only
*/

import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;

public class NameDAOImpConsole implements INameDAO {

    private Scanner reader;
    private PrintStream writer;

    public NameDAOImpConsole() throws FileNotFoundException, IOException{
        reader = new Scanner(System.in);
        writer = System.out;
    }

    public Name getName() throws IOException{
        String firstName = reader.next();
        String secondName = reader.next();
        return new Name (firstName, secondName);
    }
    public TreeSet<Name> getAllNames(){
        return null;
    }
    public void addName(Name name){
        writer.println(name.toString());
    }
    public void addAllNames(TreeSet<Name> names){

    }
}

