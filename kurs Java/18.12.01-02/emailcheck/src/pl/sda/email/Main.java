package pl.sda.email;



public class Main {

    public static void main(String[] args) {

        Test test = new Test(Check.readFile());
        System.out.println(test);

        test.emailCheck();
    }
}
