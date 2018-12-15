package pl.sda.podstawy;

public class Main {

    public static void main(String[] args) {
	//


        for(int a = 0; a < 100; a++) {
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    break;
                } else {
                    System.out.println(a);

                }
            }
        }
    }
}
