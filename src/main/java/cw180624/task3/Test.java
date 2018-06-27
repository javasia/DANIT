package cw180624.task3;

        import java.io.File;
        import java.io.FilterInputStream;
        import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ReadWriter rw = new ReadWriter();
        File out = new File("C:\\Users\\JavaPC\\git\\DANIT\\src\\main\\java\\cw180624\\task3\\Names.txt");
        rw.read(out).forEach(System.out::println);
        File in = new File("C:\\Users\\JavaPC\\git\\DANIT\\src\\main\\java\\cw180624\\task3\\out.txt");
        rw.write(out, in);

    }
}
