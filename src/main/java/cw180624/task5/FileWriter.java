package cw180624.task5;

import cw180624.task3.Name;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeSet;

public class FileWriter {
    public void write(File outFile, TreeSet<Integer> data) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new java.io.FileWriter(outFile)));
            writer.print(data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
