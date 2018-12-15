package pl.sda.pliki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NewFile {

    public static Path pathToFile = Paths.get("employees-db.txt");

    public static void testWrite() {

        String text = "Dane do zapisu";
        System.out.println(text.getBytes());
        try {
            Files.write(pathToFile, text.getBytes(), StandardOpenOption.APPEND); // nie potrzeba close
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  prepareData() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jan", "Kowal", 23);
        employees[1] = new Employee("Karol", "Biedroń", 65);
        employees[2] = new Employee("Ola", "Krawczyk", 65);
        employees[3] = new Employee("Magda", "Krawczyk", 65);
        employees[4] = new Employee("Karol", "Krawczyk", 65);

        for(Employee e: employees){
            saveEmployee(e);
        }
    }

    public static void saveEmployee(Employee employee){
        System.out.println(employee.getName());
        String linia = employee.getName() + " " + employee.getLastname() + " " + employee.getAge() + "\r\n";
        //|r CR
        //|n LF
        try {
            Files.write(pathToFile, linia.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile() {
        byte[] data = null;

        try {
            data = Files.readAllBytes(pathToFile); //zapisuje w liczbach decymalnych z tabeli ASCII
        } catch (IOException e) {
            e.printStackTrace();
        }
        String correctData = new String(data);
//        System.out.println(correctData);
        String correctDataArray[] = correctData.split("\r\n"); //tablica stringów :D
        System.out.println(correctDataArray.length);

        int i = 0;
        Employee[] employeess = new Employee[correctDataArray.length];
        for(String e: correctDataArray) {
           String[] line = e.split(" ");
            System.out.println("Dane: " + line[0]);
            employeess[i] = new Employee(line[0], line[1], Integer.parseInt(line[2]));

            i++;
        }
        System.out.println(employeess.length);
        for(Employee e: employeess) {
            System.out.println(e.toString());
        }

    }
}
