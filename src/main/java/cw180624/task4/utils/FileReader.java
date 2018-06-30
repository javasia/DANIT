package cw180624.task4.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileReader {

    private File database;

    public FileReader(File database) {
        this.database = database;
    }

    public ArrayList<String> get(File database) throws FileNotFoundException {
        return new BufferedReader(new java.io.FileReader(database))
                .lines()
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    public ArrayList<String> get() throws FileNotFoundException {
        return this.get(database);
    }
}
