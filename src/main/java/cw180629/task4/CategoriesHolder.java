package cw180629.task4;

import java.util.ArrayList;

public class CategoriesHolder {
    private int numberOfEntries;
    private ArrayList<String> names = new ArrayList<>();
    private final Categories NAME_OF_CATEGORY;

    public CategoriesHolder(Categories NAME_OF_CATEGORY) {
        this.NAME_OF_CATEGORY = NAME_OF_CATEGORY;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public Categories getNAME_OF_CATEGORY() {
        return NAME_OF_CATEGORY;
    }

    public void add(CategoryRecord record) {
        this.numberOfEntries++;
        this.names.add(record.getNAME());
    }
}
