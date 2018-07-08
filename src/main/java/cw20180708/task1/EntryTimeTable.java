package cw20180708.task1;

public class EntryTimeTable {
    private String flightName;
    private long from;
    private long to;
    private int time;

    public EntryTimeTable(String flightName, long from, long to, int time) {
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

    public String getFormatedTimeLine(){
        return String.format("%02d: %02d", getTime()/60, getTime()%60);
    }

    @Override
    public String toString() {
        return String.format("Flight: %s fromID: %d, toID: %d, departures: %d", flightName, from, to, time);
    }
}
