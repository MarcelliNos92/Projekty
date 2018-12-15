package pl.sda.exceptions;

public class Address {

    private String city;
    private String postalCode;
    private String street;
    private int number;

    public  Address(){}

    public Address(String city, String postalCode, String street, int number) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
