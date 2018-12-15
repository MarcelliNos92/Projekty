package pl.sda.exceptions;

public class Worker extends Person{

    private  String position;
    private double salary;

    public  Worker(String position, double salary, String name, String lastname, String city, String postalCode, String street, int number){

        super(name, lastname, city, postalCode, street, number);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "position: " + position + '\'' +
                ", salary: " + salary + "name: " + getName() + "lastname: " + getLastname();
    }
}
