package cw180624.task3;

public class Name implements Comparable<Name>{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Name (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString (){
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public int compareTo(Name other) {
        if (this.getLastName().compareTo(other.getLastName()) == 0){
            return this.getFirstName().compareTo(other.getFirstName());
        }else {
            return this.getLastName().compareTo(other.getLastName());
        }
    }
}