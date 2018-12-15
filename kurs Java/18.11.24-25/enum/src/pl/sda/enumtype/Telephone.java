package pl.sda.enumtype;

public enum Telephone {

    SAMSUNG(5),
    LG(2),
    IPHONE(1),
    LENOVO(2),
    NOKIA(8);

    private  int popular;

    Telephone(int popular){
        this.popular = popular;
    }

    public int getPopular(){
        return popular;

    }

}
