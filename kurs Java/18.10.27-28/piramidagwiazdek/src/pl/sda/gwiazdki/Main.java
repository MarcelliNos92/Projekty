package pl.sda.gwiazdki;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        for(int i = 1; i < a;i++) {
            if(i < a/2+1) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            else {// i = 6 and more
                for(int j = a; j > i ;j--){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}
