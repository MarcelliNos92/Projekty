package pl.sda.oop.model;

public class Employee {

    private String name;
    private String lastname;
    private  double salary;
    private Address address;

    public Employee(String name, String lastname, double salary, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
        this.address = address;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void raiseSalary(int i) {
        double raisde;
        raisde = this.salary*i/100;
        this.salary = this.salary + raisde;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
