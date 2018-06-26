package cw180624.task3;

public class Name {
    private String firstName;
    private String lastName;

    public Name (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString (){
        return String.format("%s %s", firstName, lastName);
    }
}