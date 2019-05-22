package d1_home;

import java.math.BigDecimal;
import java.nio.file.Path;

public class BankAccount {
    private int number;
    private BigDecimal cash = new BigDecimal(0);

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void depositCash(int amount){
        if(amount>0) {
            this.cash = this.cash.add(BigDecimal.valueOf(amount));
        } else {
            System.out.println("you cannot deposit 0$");
        }
    }

    public void withdrawCash(int amount){
        if(amount>0 && BigDecimal.valueOf(amount).compareTo(this.cash)==-1){
            this.cash = this.cash.subtract(BigDecimal.valueOf(amount));
        } else {
            System.out.println("smth gone wrong");
        }
    }

    @Override
    public String toString() {
        return this.number + " " + this.cash.toString();
    }
}
