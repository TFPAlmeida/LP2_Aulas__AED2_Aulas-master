package edu.ufp.inf.lp2.aulas.tp._04_Bank;

import edu.ufp.inf.lp2.aulas.tp._03PL.Person ;

import java.util.ArrayList;
import java.util.Date;

public class Client extends Person implements ClientRelatioshipsI {
    private String vatNumber;
    private ArrayList<Account> accounts = new ArrayList<>();

    @Override
    public void addAccount(Account a) {
        for (Account account : this.accounts){
            if (account.getAccountNumber()==a.getAccountNumber()){
                System.out.println("Erro");
                return;
            }
        }
        this.accounts.add(a);
        a.setAccountOwner(this);
    }

    @Override
    public Account getAccount(int index) {

        return (index>=0 && index < accounts.size()?accounts.get(index):null);
    }

    public Client(String id, String n, String a, Date b, String vn){
        super(id, n, a,b);
        this.vatNumber=vn;
    }


}