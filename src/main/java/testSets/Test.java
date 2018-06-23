package testSets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<MyHashClassOne> ms1 = new HashSet<>();
        ms1.add(new MyHashClassOne("Andrey"));
        ms1.add(new MyHashClassOne("Andrey2"));
        ms1.add(new MyHashClassOne("Andrey4"));

        ms1.forEach(System.out::println);

        Set<MyHashClassTwo> ms2 = new TreeSet<>();
        ms2.add(new MyHashClassTwo("Andrey"));
        ms2.add(new MyHashClassTwo("Andrey2"));
        ms2.add(new MyHashClassTwo("Andrey4"));

        ms2.forEach(System.out::println);
    }
}
