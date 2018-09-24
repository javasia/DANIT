package cw23092018.timeTable;

public class TimeTableEntry {
    private String flightName;
    private long from;
    private long to;
    private int time;

    public TimeTableEntry(String flightName, long from, long to, int time) {
        this.flightName = flightName;
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public long getFrom() {
        return from;
    }

    public long getTo() {
        return to;
    }

    public int getTime() {
        return time;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getFormattedTimeLine(){
        return String.format("%02d: %02d", getTime()/60, getTime()%60);
    }

}
