package cw180624.task4;

import cw180624.task4.utils.FileReader;
import cw180624.task4.utils.FilterData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class DataBaseAdapter {
    private ArrayList<String> dirtyDataBase;
    private PriorityQueue<User> dataBase;

    public PriorityQueue<User> getCleanDataBase() {
        return dataBase;
    }

    public DataBaseAdapter(String inputPath) throws FileNotFoundException {
        this(new File(inputPath));
    }

    public DataBaseAdapter(File input) throws FileNotFoundException {
        dirtyDataBase = new FileReader(input).get();
        dataBase = new FilterData(dirtyDataBase).filter();
    }

}
