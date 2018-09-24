package cw23092018.timeTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeTable {
    private Map<Long, CityEntry> cities;
    private Set<TimeTableEntry> flights;
    private Set<TimeTableLine> timeTableLines;
    private int maxRowWidth;

    public TimeTable(File citiesDB, File flightsDB) throws FileNotFoundException {
        this.cities = new ManagerCity(citiesDB).getCities();
        this.flights = new ManagerFlight(flightsDB).getFlights();
        cities.forEach((id, city) -> this.maxRowWidth = Math.max(city.getName().length(), this.maxRowWidth));
    }

    public void printTimeTable() {
        String lineSeparator = getLineSeparator("_", maxRowWidth, 4);
        String tableHeader = new TimeTableLine(maxRowWidth, "|").toString();

        System.out.println(lineSeparator);
        System.out.println(tableHeader);
        System.out.println(lineSeparator);
        flights.forEach(timeTableEntry ->
                System.out.print(new TimeTableLine(timeTableEntry, maxRowWidth, "|", this.cities)));
        System.out.println(lineSeparator);
    }

    private String getLineSeparator(String separator, int rowWidth, int rows) {
        return Stream.generate(() -> separator)
                .limit(rowWidth * rows + (rows * 3)) // 3 - extra space for each line terminator plus spaces
                .collect(Collectors.joining());
    }



}