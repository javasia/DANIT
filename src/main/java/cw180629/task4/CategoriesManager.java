package cw180629.task4;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoriesManager {
    private HashMap<Categories, CategoriesHolder> dataBase = new HashMap<>(3);

    public CategoriesManager() {
        this.dataBase.put(Categories.Director, new CategoriesHolder(Categories.Director));
        this.dataBase.put(Categories.Manager, new CategoriesHolder(Categories.Manager));
        this.dataBase.put(Categories.Topmanager, new CategoriesHolder(Categories.Topmanager));
    }

    public void add(CategoryRecord record) {
        dataBase.get(record.getNAME_OF_CATEGORY()).add(record);
    }

    /* FORMAT:
    Manager:10:[Victor, ..., ..., ..., ...]
    Topmanager:3:[Sergey, ..., ..., ..., ...]
    Director:1:[Masha]
    */
    @Override
    public String toString() {
        return new StringBuilder()
                .append(
                        String.format("%s:%d:%s",
                        Categories.Manager.toString(),
                        dataBase.get(Categories.Manager).getNumberOfEntries(),
                        dataBase.get(Categories.Manager).getNames().toString()))
                .append("\n")
                .append(String.format("%s:%d:%s",
                        Categories.Topmanager.toString(),
                        dataBase.get(Categories.Topmanager).getNumberOfEntries(),
                        dataBase.get(Categories.Topmanager).getNames().toString()))
                .append("\n")
                .append(String.format("%s:%d:%s",
                        Categories.Director.toString(),
                        dataBase.get(Categories.Director).getNumberOfEntries(),
                        dataBase.get(Categories.Director).getNames().toString()))
                .append("\n").toString();
    }

    class CategoriesHolder {
        private int numberOfEntries;
        private ArrayList<String> names = new ArrayList<>();
        private final Categories NAME_OF_CATEGORY;

        private CategoriesHolder(Categories NAME_OF_CATEGORY) {
            this.NAME_OF_CATEGORY = NAME_OF_CATEGORY;
        }

        private int getNumberOfEntries() {
            return numberOfEntries;
        }

        private ArrayList<String> getNames() {
            return names;
        }

        private Categories getNAME_OF_CATEGORY() {
            return NAME_OF_CATEGORY;
        }

        private void add(CategoryRecord record) {
            this.numberOfEntries++;
            this.names.add(record.getNAME());
        }
    }
}
