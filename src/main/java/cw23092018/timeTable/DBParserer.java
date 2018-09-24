package cw23092018.timeTable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


public class DBParserer<T extends Collection<String>> {
    private File database;

    public DBParserer(File database) {
        this.database = database;
    }

    public DBParserer(String filePath) {
        this(new File(filePath));
    }

    public T get(File database) throws FileNotFoundException {
        return new BufferedReader(new java.io.FileReader(database))
                .lines()
                .collect(Collectors.toCollection(() -> (T) new ArrayList<String>()));
    }

    public T get() throws FileNotFoundException {
        return this.get(database);
    }
}

