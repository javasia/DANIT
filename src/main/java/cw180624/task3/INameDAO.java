package cw180624.task3;

import java.util.TreeSet;
import java.io.*;

public interface INameDAO {
    Name getName() throws IOException;
    TreeSet<Name> getAllNames();
    void addName(Name name) throws IOException;
    void addAllNames(TreeSet<Name> names);
}
