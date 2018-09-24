package cw23092018.timeTable;

import java.util.Map;

public class TimeTableLine {
    private String line;
    private int rowWidth = 0;
    private final String rowTerminator;

    public TimeTableLine(TimeTableEntry timeTableEntry, int rowWidth, String rowTerminator,  Map<Long, CityEntry> cities) {
        this.rowWidth = rowWidth;
        this.rowTerminator = rowTerminator;
        String formatStr = getFormatString(rowTerminator);
        this.line = new StringBuilder()
                .append(String.format(formatStr, timeTableEntry.getFlightName()))
                .append(String.format(formatStr, cities.get(timeTableEntry.getFrom()).getName()))
                .append(String.format(formatStr, cities.get(timeTableEntry.getTo()).getName()))
                .append(String.format(formatStr, timeTableEntry.getFormattedTimeLine()))
                .append("\n").toString();
    }

    public TimeTableLine(int rowWidth, String rowTerminator) {
        this.rowWidth = rowWidth;
        this.rowTerminator = rowTerminator;
        String formatStr = getFormatString(rowTerminator);
        this.line = new StringBuilder()
                .append(String.format(formatStr, "Flight:"))
                .append(String.format(formatStr, "Origin:"))
                .append(String.format(formatStr, "Dest:"))
                .append(String.format(formatStr, "Time:"))
                .append("\n").toString();
    }

    public String getFormatString(String rowTerminator) {
        return " %-" + rowWidth + "s " + rowTerminator; // "%-12s" + terminator;
    }

    public int getRowWidth() {
        return rowWidth;
    }

    public String getRowTerminator() {
        return rowTerminator;
    }

    @Override
    public String toString() {
        return line;
    }
}
