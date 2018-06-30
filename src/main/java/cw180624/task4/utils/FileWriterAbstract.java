package cw180624.task4.utils;

import cw180624.task4.User;
import cw180624.task4.interfaces.XmlPrintable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;

public abstract class FileWriterAbstract {

    protected File output;

    public FileWriterAbstract(String outputPath) {
        this (new File(outputPath));
    }

    public FileWriterAbstract(File output) {
        this.output = output;
    }

    public void write(PriorityQueue<User> inputData, boolean copyToConsole) {
        PriorityQueue<User> data = new PriorityQueue<>(inputData);
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new BufferedWriter(new java.io.FileWriter(output)));
            while (data.size() > 0) {
                String user = data.poll().toString();
                printWriter.println(user);
                if (copyToConsole) System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }

    public void write(PriorityQueue<User> data){
        write(data, false);
    }

    public abstract <T extends XmlPrintable> void writeXml(PriorityQueue<T> data, boolean copyToConsole);
    public abstract void writeXml(PriorityQueue<User> data);
}
