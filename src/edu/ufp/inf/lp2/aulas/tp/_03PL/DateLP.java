package edu.ufp.inf.lp2.aulas.tp._03PL;

import java.util.Date;

public class DateLP {

    private short day;

    private short month;

    private int year;

    public void construtor(long millis){

        this.month=0;
        this.year=0;

        this.day= (short) (millis/86400);
        while(this.day>=30){
            this.month++;
            this.day-=30;
        }

        while(this.month>=12){
            this.year++;
            this.month-=12;
        }

        Date date = new Date(this.day, this.month, this.year);

        System.out.println("GetDate:" + date.getDate() + "\nGetDay:" + date.getDay() + "\nGetMonth:" + date.getMonth() + "\nGetYear:" + date.getYear());

        System.out.println("\nthis.day:" + this.day + "\nthis.month:" + this.month + "\nthis.year:" + this.year);

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

    public int compareTo(DateLP d) {
        return 0;
    }

    public boolean afterDate(DateLP d) {
        return false;
    }

    public boolean beforeDate(DateLP d) {
        return false;
    }

    public int diferenceDays(DateLP d) {
        return 0;
    }

    public int diferenceMonth(DateLP d) {
        return 0;
    }

    public int diferenceYears(DateLP d) {
        return 0;
    }

    public void incrementDate() {
    }

    private long daysCrawlerRecursiveAux(DateLP begin, DateLP end) {
        return 0;
    }

    public int daysCrawlerRecursive(DateLP begin, DateLP end) {
        return 0;
    }

    public int daysCrawler(DateLP begin, DateLP end) {
        return 0;
    }

    public int monthsCrawler(DateLP begin, DateLP end) {
        return 0;
    }

    public boolean isLeapYear(int year) {
        return false;
    }

    public int daysMonth(short month, int year) {
        return 0;
    }

    public int daysBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
        return 0;
    }

    public static void main(String[] args) {

        DateLP dateLP = new DateLP();

        dateLP.construtor((long) 2.628e+6);

    }

}
