package cw23092018.timeTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class ManagerFlight implements ManagerEntry<Set> {
    private Set<TimeTableEntry> flights;

    public ManagerFlight(File dataBaseFile) throws FileNotFoundException {
        this.flights = items(dataBaseFile);
    }

    public Set<TimeTableEntry> items(File dataBaseFile) throws FileNotFoundException {
        return new DBParserer<ArrayList<String>>(dataBaseFile)
                .get()
                .stream()
                .map(s -> new TimeTableEntry(s.split(":")[0], Long.parseLong(s.split(":")[1]),
                        Long.parseLong(s.split(":")[2]),
                        Integer.parseInt(s.split(":")[3])))
                .collect(Collectors.toSet());
    }

    public void print() {
        flights.forEach(System.out::println);
    }

    public Set<TimeTableEntry> getFlights() {
        return flights;
    }
}