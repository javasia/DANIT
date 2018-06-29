package cw180624.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileReaderArrayList {

    private File database;

    public FileReaderArrayList(File database) {
        this.database = database;
    }

    public ArrayList<String> get(File database) throws FileNotFoundException {
        return new BufferedReader(new FileReader(database)).lines().collect(Collectors.toCollection(() -> new ArrayList<>()));
    }

    public ArrayList<String> get() throws FileNotFoundException {
        return this.get(database);
    }
}
