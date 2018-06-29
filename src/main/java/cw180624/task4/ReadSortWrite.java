package cw180624.task4;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class ReadSortWrite {
    private ArrayList<String> dirtyDataBase;
    private TreeMap<Long, User> dataBase;
    private Iterator iterator;
    private final String delimiter = " ";

    public ReadSortWrite(File file) throws FileNotFoundException {
        dirtyDataBase = new FileReaderArrayList(file).get();
        dataBase = new FilterData(dirtyDataBase).filter();
    }

}
