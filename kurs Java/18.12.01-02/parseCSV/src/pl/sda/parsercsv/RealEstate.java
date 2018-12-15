package pl.sda.parsercsv;

public class RealEstate {

    private String city;
    private String state;
    private int zip;
    private String street;
    private int squareFt;
    private String type;
    private String saleDate;
    private int price;
    private float lat;
    private float lon;
    private int beds;
    private int baths;



    public RealEstate(String street, String city, int zip, String state, int beds, int baths, int squareFt, String type, String saleDate, int price, float lat, float lon) {

        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.squareFt = squareFt;
        this.type = type;
        this.saleDate = saleDate;
        this.price = price;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getSquareFt() {
        return squareFt;
    }

    public void setSquareFt(int squareFt) {
        this.squareFt = squareFt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }
    @Override
    public String toString() {
        return "RealEstate{" +
                "city: " + city  +
                ", state: " + state  +
                ", zip: " + zip +
                ", street: " + street  +
                ", squareFt: " + squareFt +
                ", type: " + type  +
                ", saleDate: " + saleDate  +
                ", price: " + price +
                ", lat: " + lat +
                ", lon: " + lon +
                ", beds: " + beds +
                ", baths: " + baths +
                '}';
    }
}
