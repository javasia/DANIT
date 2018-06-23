package testSets;

public class MyHashClassTwo implements Comparable<MyHashClassTwo>{

    private String name;

    public MyHashClassTwo(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(MyHashClassTwo o) {
        return 1;
    }
}
