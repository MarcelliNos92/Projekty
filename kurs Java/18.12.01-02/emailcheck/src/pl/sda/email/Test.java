package pl.sda.email;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    private List<Person> person;

    public Test(List<Person> person) {
        this.person = person;
    }


    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public void emailCheck() {
            int sumaN=0;
        for (Person e: person) {
            System.out.println(e.getEmail());
            if(validate(e.getEmail())){
                System.out.println("Adres poprawny");

            }
            else {
                System.out.println("Adres niepoprawny");
                sumaN = sumaN + 1;
            }

        }
        System.out.println(sumaN);
    }
}