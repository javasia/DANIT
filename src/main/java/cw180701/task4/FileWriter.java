package cw180701.task4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

public class FileWriter<T extends Collection> {

    private File outFile;

    public FileWriter(String outFilePath) {
        this.outFile = new File(outFilePath);
    }

    public FileWriter() {
    }

    public void write(File outFile, T data) {
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

    public void write(T data) {
        write(this.outFile, data);
    }
}
