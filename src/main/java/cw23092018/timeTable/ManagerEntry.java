package cw23092018.timeTable;

import java.io.File;
import java.io.FileNotFoundException;

public interface ManagerEntry<T> {
      T items(File dbFile) throws FileNotFoundException;
      void print();
}
