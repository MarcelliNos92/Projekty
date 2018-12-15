package pl.sda.email;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

    public static Path file = Paths.get("MOCK_DATA.csv");

    public static List<Person> readFile() {

        List<Person> personList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(file);
            lines.remove(0);
            for (String l : lines) {
                String[] line = l.split(",");
                Person person1 = new Person(Integer.parseInt(line[0]), line[1], line[2], line[3], line[4], line[5]);
                personList.add(person1);
            }
            System.out.println(personList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }


}



