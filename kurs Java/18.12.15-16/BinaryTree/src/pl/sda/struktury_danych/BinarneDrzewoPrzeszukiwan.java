package pl.sda.struktury_danych;

public class BinarneDrzewoPrzeszukiwan {

    private  Wezel korzen;

    public BinarneDrzewoPrzeszukiwan() {
        korzen = null;
    }

    public void dodaj(int wartosc){
        korzen = dodajRekurencyjnie(korzen, wartosc);
    }

    public boolean zawieraWezel(int wartosc) {
        return zawieraWezelRekurencyjnie(korzen, wartosc);
    }

    public void usun (int wartosc) {
        korzen = usunRekurencyjnie(korzen, wartosc);
    }

    private Wezel dodajRekurencyjnie(Wezel obecny, int wartosc) {
        if(obecny == null) {
            return new Wezel(wartosc);
        }
        if(wartosc < obecny.getWartosc()){
            obecny.setLewy((dodajRekurencyjnie(obecny.getLewy(),wartosc)));
        }
        else if(wartosc > obecny.getWartosc()) {
            obecny.setPrawy(dodajRekurencyjnie(obecny.getPrawy(), wartosc));
        }

        return obecny;
    }

    private boolean zawieraWezelRekurencyjnie(Wezel obecny, int wartosc) {
        if(obecny == null){
            return false;
        }

        if(wartosc == obecny.getWartosc()){
            return  true;
        }
        else if(wartosc < obecny.getWartosc()) {
            return zawieraWezelRekurencyjnie(obecny.getLewy(), wartosc);
        }
        else if (wartosc > obecny.getWartosc()) {
            return zawieraWezelRekurencyjnie(obecny.getPrawy(), wartosc);
        }

        return  false;
    }

    private Wezel usunRekurencyjnie(Wezel obecny, int wartosc) {
        if(obecny == null) {
            return null;
        }

        if(wartosc == obecny.getWartosc()) {
            if(obecny.getLewy() == null && obecny.getPrawy() == null) {
                return null;
            }
            else if(obecny.getPrawy() == null) {
                return obecny.getLewy();
            }
            else if(obecny.getLewy() == null) {
                return obecny.getPrawy();
            }
            else{
                int najmnieszaWartosc = znajdzNajmniejszy(obecny.getPrawy());
                obecny.setWartosc(najmnieszaWartosc);
                obecny.setPrawy(usunRekurencyjnie(obecny.getPrawy(), najmnieszaWartosc));
                return obecny;
            }
        }
        else if(wartosc < obecny.getWartosc()) {
            obecny.setLewy(usunRekurencyjnie(obecny.getLewy(), wartosc));
        }
        else if (wartosc > obecny.getWartosc()) {
            obecny.setPrawy(usunRekurencyjnie(obecny.getPrawy(),wartosc));
        }

        return obecny;
    }

    private int znajdzNajmniejszy(Wezel obecny) {
        if(obecny.getLewy() == null) {
            return  obecny.getWartosc();
        }

        return znajdzNajmniejszy(obecny.getLewy());
    }


    }

