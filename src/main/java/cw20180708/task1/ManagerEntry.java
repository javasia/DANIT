package cw20180708.task1;

import java.io.File;
import java.io.FileNotFoundException;

public interface ManagerEntry<T> {
      T parseDB(File dbFile) throws FileNotFoundException;
      void print();
}
