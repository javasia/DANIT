package cw20180708.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeTable {
    private Map<Long, CityEntry> cities;
    private Set<TimeTableEntry> flights;
    private int rowWidth = 0;

    public TimeTable(File citiesDB, File flightsDB) throws FileNotFoundException {
        this.cities = new ManagerCity(citiesDB).getCities();
        this.flights = new ManagerFlight(flightsDB).getFlights();
        cities.forEach((id, city) -> rowWidth = Math.max(city.getName().length(), rowWidth));
    }

    public void printTimeTable() {
        final String rowTerminator = "|";
        String lineSeparator = getLineSeparator("_", rowWidth, 4);
        String formatStr = getFormatString(rowTerminator);
        String tableHeader = getTableHeader(formatStr);
        System.out.println(lineSeparator);
        System.out.println(tableHeader);
        System.out.println(lineSeparator);
        flights.forEach(new Consumer<TimeTableEntry>() {
            @Override
            public void accept(TimeTableEntry timeTableEntry) {
                System.out.print(new StringBuilder()
                        .append(String.format(formatStr, timeTableEntry.getFlightName()))
                        .append(String.format(formatStr, cities.get(timeTableEntry.getFrom()).getName()))
                        .append(String.format(formatStr, cities.get(timeTableEntry.getTo()).getName()))
                        .append(String.format(formatStr, timeTableEntry.getFormatedTimeLine()))
                        .append("\n").toString());
            }
        });
        System.out.println(lineSeparator);
    }

    private String getFormatString(String rowTerminator) {
        return " %-" + rowWidth +"s " + rowTerminator; // "%-12s" + terminator;
    }

    private String getTableHeader(String formatString) {
        return String.format( formatString, "Flight:") +
                String.format(formatString, "Origin:") +
                String.format(formatString, "Dest:") +
                String.format(formatString, "Time:");
    }

    private String getLineSeparator (String separator, int rowWidth, int rows){
        return Stream
                .generate(() -> separator)
                .limit(rowWidth*rows+(rows*3)) // 3 - extra space for each line terminator plus spaces
                .collect(Collectors.joining());
    }
}