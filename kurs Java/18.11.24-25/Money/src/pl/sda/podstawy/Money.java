package pl.sda.podstawy;

public class Money implements IMoney{

private double amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public boolean equals(Money money){
        if(getAmount() == money.getAmount()){
            return true;
        }
        else {
            return false;
        }
    }
}
