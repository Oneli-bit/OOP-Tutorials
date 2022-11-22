import java.util.ArrayList;
import java.util.Collections;

public class BankAccount implements Comparable<BankAccount>
{
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }


    /**
     Compares two bank accounts. these are java.comments
     @param other the other BankAccount
     @return 1 if this bank account has a greater balance than the other one,
     -1 if this bank account is has a smaller balance than the other one,
     and 0 if both bank accounts have the same balance
     */
    @Override
    public int compareTo(BankAccount other) {
        if (balance > other.getBalance()) {
            return 1;
        } else if (balance < other.getBalance()) {
            return -1;
        } else  { //same balance on both accounts
            return 0;
        }

    }
}





