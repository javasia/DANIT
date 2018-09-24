package cw23092018.timeTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ManagerCity implements ManagerEntry<Map> {
    private Map<Long, CityEntry> cities;

    public ManagerCity(File dataBaseFile) throws FileNotFoundException {
        this.cities = items(dataBaseFile);
    }

    public Map<Long, CityEntry> items(File dataBaseFile) throws FileNotFoundException {
        return new DBParserer<ArrayList<String>>(dataBaseFile)
                .get() // TreeSet <String>
                .stream() // Stream <String>
                .map(s -> new CityEntry(Long.parseLong(s.split(":")[0]), s.split(":")[1]))// Steam <CityEntry>
                .collect(Collectors.toMap(city -> city.getId(), city -> city)); // Map<Long, CityEntry>

    }

    public Map<Long, CityEntry> getCities() {
        return cities;
    }

    public void print() {
        cities.forEach((id, city) -> System.out.println(city));
    }
}
