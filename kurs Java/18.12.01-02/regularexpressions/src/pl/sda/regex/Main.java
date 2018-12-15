package pl.sda.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static void main(String[] args) {

        if(validate("adres@pl")){
            System.out.println("Adres poprawny");
        }
        else {
            System.out.println("Adres niepoprawny");
        }
        Pattern compiledPattern = Pattern.compile("Jan.*");
        Matcher matcher = compiledPattern.matcher("Jan lubi koty");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        System.out.println(Pattern.matches(".k", "ok"));
        System.out.println(Pattern.matches("..k", "ook"));
        System.out.println(Pattern.matches("[abcd]", "ab")); //a lub b lub c lub d
        System.out.println(Pattern.matches("\\d", "3"));
        System.out.println(Pattern.matches("\\d", "Ab"));
        System.out.println(Pattern.matches("[abcd]+", "aaa"));
        System.out.println(Pattern.matches("[0-9][0-9]", "45"));
        System.out.println(Pattern.matches("[0-9]+", "444"));
        System.out.println(Pattern.matches("[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]", "098-987-123"));
        System.out.println(Pattern.matches("[^0-9]", "W")); //wszystko co nie jest liczba
        System.out.println(Pattern.matches("\\D", "W"));
        System.out.println(Pattern.matches("\\D{2}", "WW"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7000000000"));

    }
}
