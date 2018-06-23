package testSets;

public class MyHashClassOne {

    private String name;

    MyHashClassOne (String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == ((MyHashClassOne)obj).hashCode();
    }
}
