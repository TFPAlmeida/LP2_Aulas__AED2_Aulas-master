package edu.ufp.inf.lp2.aulas.tp._04_Bank;

public class AccountSafe extends Account{
    public AccountSafe(int an, double b, Client o) {
        super(an, b, o);
    }

    @Override
    public double withdraw(double a) {
        return 0;
    }

    @Override
    public double transfer(AccountMoneyI destination, double amount) {
        return 0;
    }

    @Override
    public double deposit(double a) {
        return 0;
    }



    @Override
    public double balance() {
        return 0;
    }

    @Override
    public Client getAccountOwner() {
        return null;
    }
}
