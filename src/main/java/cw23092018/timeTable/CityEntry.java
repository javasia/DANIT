package cw23092018.timeTable;

public class CityEntry {
    private long id;
    private String name;

    public CityEntry(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, NAME: %s", id, name);
    }
}
