package edu.ufp.inf.lp2.aulas.tp._04_Bank;

public abstract class Account implements AccountMoneyI, AccountOwnershipI {
    private int accountNumber;
    private double balance;
    private Client owner;


    public int getAccountNumber() {
        return accountNumber;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected Client getOwner() {
        return owner;
    }

    protected void setOwner(Client o) {
        this.owner = o;
    }

    public void setAccountOwner(Client o){
        if(owner == null){
            this.setOwner(o);
        }else{
            System.out.println("Já Existe!");
        }

    }

    //ACABAR

    public Account(int an, double b, Client o) {
        this.accountNumber = an;
        this.balance = b;
        this.owner = o;
        if ((this.owner != null)) {
            this.owner.addAccount(this);
        }
    }
}
