package cw180624.task3;

import java.io.*;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReadWriter<E extends Name> {

    public TreeSet<Name> read(File inFile) throws IOException {
        return new BufferedReader(new FileReader(inFile)).lines().map(s -> new Name(s.split(" ")[0], s.split(" ")[1])).collect(Collectors.toCollection(() -> new TreeSet<>()));
    }

    public void write(File inFile, File outFile) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
            for (Name name : read(inFile)) {
                writer.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    public void print(File file) throws IOException {
        this.read(file).forEach(System.out::println);
    }

}
