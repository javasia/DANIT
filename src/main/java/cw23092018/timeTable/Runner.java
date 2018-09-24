package cw23092018.timeTable;

import java.io.File;
import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        File citiesDB = new File("src/main/java/cw20180708/task1/res", "Cities.txt");
        File flightDB = new File("src/main/java/cw20180708/task1/res", "TimeTable.txt");
        new OperatorConsole(new TimeTable(citiesDB, flightDB)).start();
    }
}
