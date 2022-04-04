package edu.ufp.inf.lp2.aulas.tp._03PL;

import java.util.Date;

public class Person {
    private String idNumber;
    private String name;
    private String adress;
    private Date birth;

    public Person(String id, String n, String a, Date b) {
        this.idNumber=id;
        this.name=n;
        this.adress=a;
        this.birth=b;
    }

    public int age() {
        return 0;
    }
    public boolean olderThan(Person p) {
        return false;
    }
    public String toString() {
        return null;
    }
    public boolean equals(Object o) {
        return false;
    }
    public int hashCode() {
        return 0;
    }

}