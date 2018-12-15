package pl.sda.Tablice2D;

public class Main {

    public static void main(String[] args) {


        int[][] tab = new int[10][10];
        // wiersze
        for(int i = 0; i < 10; i++){
            //kolumny
            for(int j = 0; j < 10; j++){
                tab[i][j] = 0;
            }

        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println("");
        }

        // zadanie tablica 4X4 sumowanie
//        1 4 5 2 = 12
//        5 8 9 2
//        2 3 2 3
//        2 1 2 4
        int[][] tab2 = new int[4][4];

        tab2[0][0] = 1; tab2[0][1] = 4; tab2[0][2] = 5; tab2[0][3] = 2;
        tab2[1][0] = 5; tab2[1][1] = 8; tab2[1][2] = 9; tab2[1][3] = 2;
        tab2[2][0] = 2; tab2[2][1] = 3; tab2[2][2] = 2; tab2[2][3] = 3;
        tab2[3][0] = 2; tab2[3][1] = 1; tab2[3][2] = 2; tab2[3][3] = 4;

        for(int i = 0; i < 4; i++) {
            int wynik = 0;
            for (int j = 0; j < 4; j++) {
                wynik = wynik + tab2[i][j];
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println(" = " + wynik);

        }



    }
}
