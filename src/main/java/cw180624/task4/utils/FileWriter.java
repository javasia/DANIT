package cw180624.task4.utils;

import cw180624.task4.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;

public class FileWriter extends FileWriterAbstract {

    public FileWriter(String outputPath) {
        super(outputPath);
    }

    public FileWriter(File output) {
        super(output);
    }

    @Override
    public <T extends XmlPrintable> void writeXml(PriorityQueue<T> data, boolean copyToConsole) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new BufferedWriter(new java.io.FileWriter(output)));
            boolean isFirstEntry = true;
            String header = "";
            String footer = "";
            while (data.size() > 0) {
                if (isFirstEntry){
                        isFirstEntry = false;
                        header = data.peek().getXmlHeader();
                        footer =  data.peek().getXmlFooter();
                        printWriter.println(header);
                        if (copyToConsole) System.out.println(header);
                }
                String user = data.poll().toXmlString();
                printWriter.println(user);
                if (copyToConsole) System.out.println(user);
            }
            if (!isFirstEntry){
                printWriter.println(footer);
                if (copyToConsole) System.out.println(footer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }

    @Override
    public void writeXml(PriorityQueue<User> data){
        write(data, false);
    }
}
