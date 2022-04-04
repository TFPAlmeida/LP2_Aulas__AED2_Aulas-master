package edu.ufp.inf.lp2.aulas.tp._04_Bank;

public class AccountUnsafe extends Account{

    public AccountUnsafe(int an, double b, Client o) {
        super(an, b, o);
    }

    @Override
    public double withdraw(double a) {
        super.setBalance(super.getBalance()-a);
        return this.getBalance();
    }

    @Override
    public double deposit(double a) {
        super.setBalance(super.getBalance()+a);
        return this.getBalance();
    }

    @Override
    public double transfer(AccountMoneyI d, double a) {
        double b = this.withdraw(a);
        d.deposit(a);
        return b;
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

