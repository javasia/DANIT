package cw20180708.task1;

import global.utils.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class ManagerFlight implements ManagerEntry<Set> {
    private Set<EntryTimeTable> flights;

    public ManagerFlight(File dataBaseFile) throws FileNotFoundException {
        this.flights = parseDB(dataBaseFile);
    }

    public Set<EntryTimeTable> parseDB(File dataBaseFile) throws FileNotFoundException { // toDO Change to one liner
        return new FileReader<ArrayList<String>>(dataBaseFile)
                .get()
                .stream()
                .map(s -> new EntryTimeTable(s.split(":")[0], Long.parseLong(s.split(":")[1]),
                        Long.parseLong(s.split(":")[2]),
                        Integer.parseInt(s.split(":")[3])))
                .collect(Collectors.toSet());
    }

    public void print() {
        flights.forEach(System.out::println);
    }

    public Set<EntryTimeTable> getFlights() {
        return flights;
    }
}