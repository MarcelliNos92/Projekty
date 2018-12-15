package pl.sda.exceptions;

public class Person extends Address{

    private String name;
    private String lastname;


    public Person(String name, String lastname, String city, String postalCode, String street, int number) {

        super(city, postalCode,street,number);
        this.name = name;
        this.lastname = lastname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
