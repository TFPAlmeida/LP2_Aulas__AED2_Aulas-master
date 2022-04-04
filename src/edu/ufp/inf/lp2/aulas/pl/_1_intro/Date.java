package edu.ufp.inf.lp2.aulas.pl._1_intro;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date() {
    Calendar gregCalendar = new GregorianCalendar();
    this.day = (short) gregCalendar.get(Calendar.DAY_OF_MONTH);
    this.month = (short) gregCalendar.get((Calendar.DAY_OF_MONTH) + 1);
    this.year = (short) gregCalendar.get(Calendar.DAY_OF_YEAR);
  }

  public Date(long currentTimeMillis) {
    java.util.Date d = new java.util.Date(currentTimeMillis);
    this.day = (short) d.getDay();
    this.month = (short) d.getMonth();
    this.year = d.getYear() + 1900;
  }

  public Date(Date d) {
    this.day = d.day;
    this.month = d.month;
    this.year = d.year;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean beforeDate(Date d) {
    if (d.year < this.year)
      return true;
    else
    {
      if (d.year == this.year)
        if (this.month < d.month)
          return true;
        else
        if (this.month == d.month)
          return this.day < d.day;

    }
    return false;
  }

  public boolean afterDate(Date d) {
    if (d.year == this.year && d.month == this.month && d.day == this.day)
      return false;
    else
      return !beforeDate(d);
  }

  public static boolean isLeapYear(int year) {
    return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
  }

  public void incrementedDate() {
    if (this.month == 12 && (this.day == daysMonth((short) this.month, this.year))) {
      this.month = 1;
      this.day = 1;
      this.year += 1;
    } else {
      if (this.day < Date.daysMonth((short) this.month, this.year)) {
        this.day++;
      } else {
        this.day = 1;
        this.month += 1;
      }
    }
  }

  public static int monthsCrawler(Date begin, Date end) {
    int year = begin.year, monthCount = 0;
    while (year < end.year) {
      monthCount += (begin.month < end.month ? 12 :
              Date.monthsBetweenMonths((short) begin.day, (short) begin.month, (short) 31, (short) 12, year));
      year++;
    }
    if(begin.year == end.year)
      monthCount += Date.monthsBetweenMonths((short) begin.day, (short) begin.month, (short) end.day, (short) end.month, year);
    else
    if(begin.month <= end.month)
      monthCount += Date.monthsBetweenMonths((short) 1, (short) 1, (short) end.day, (short) end.month, end.year);

    return monthCount;
  }

  private static int monthsBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
    short month = beginMonth, monthCount = 0;

    while ((month < endMonth) && (beginDay <= endDay)) {
      monthCount++;
      month++;
    }

    if (month == endMonth && ((endDay - beginDay + 1) == Date.daysMonth(month, year))) {
      monthCount++;
    }
    return monthCount;
  }


  public int differenceYears(Date d) {
    return differenceMonths(d) / 12;
  }

  public int differenceMonths(Date d) {
    return 0;//return Date.monthsCrawler();
  }

  private int compareTo(Date d) {
    return 0;
  }

  public static int daysMonth(short month, int year) {
    switch (month) {
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        return (isLeapYear(year) ? 29 : 28);
      default:
        return 31;
    }
  }

  private static int daysBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year){

    int month = beginMonth, daysCount = 0;

    if(beginMonth == endMonth){
      return endDay - beginDay;
    }

    daysCount = Date.daysMonth((short) month, year) - beginDay;
    month+=1;

    while(month < endMonth){
      daysCount += Date.daysMonth((short) month, year);
      month+=1;
    }
    daysCount += endDay;

    return daysCount;
  }

  public int diferenceDays(Date d){
    return Date.daysCrawler(this, d);
  }

  public static int daysCrawler(Date begin, Date end){

    int year = begin.year, daysCount = 0;

    while(year < end.year){
      int yeardays = (Date.isLeapYear(year) ? 366 : 365);
      daysCount = ((begin.month) < end.month ? (daysCount + yeardays) : (daysCount + daysBetweenMonths((short) begin.day, (short) begin.month, (short ) 31, (short) 12, year)));
      year+=1;
    }

    if(year == end.year){
        daysCount += daysBetweenMonths((short) begin.day, (short) begin.month, (short) end.day, (short) end.month, year);
    } else{
      if(begin.month < end.month){
        daysCount += daysBetweenMonths((short) begin.day, (short) begin.month, (short) end.day, (short) end.month, year);
      } else{
        daysCount += daysBetweenMonths((short) 1, (short) end.month, (short) end.day, (short) end.month, year);
      }
    }
      return daysCount;
  }

  public static long daysCrawlerRecursiveAux(Date begin, Date end){
    if(begin.beforeDate(end)) {
      begin.incrementedDate();
      return (1 + Date.daysCrawlerRecursiveAux(begin, end));
    }
   return 0;
  }

  public static int daysCrawlerRecursive(Date begin, Date end){
    int diffDays = 0;
    int diffYears = ((begin.month <= end.month) ? (end.year - begin.year) : (end.year - begin.year-1));
    Date auxBegin = new Date(begin), auxEnd = null;

    while(diffYears > 10){
      diffYears -= 10;
      auxEnd = new Date(auxBegin.day, auxBegin.month, auxBegin.year + 10);
      diffDays += daysCrawlerRecursiveAux(auxBegin, auxEnd);
      begin.year += 10;
      auxBegin = new Date(begin);
    }

    auxEnd = new Date(end);

    diffDays += daysCrawlerRecursiveAux(auxBegin, auxEnd);
    return diffDays;
  }

  public static void main(String[] args) {
    Date teste = new Date();
    teste.beforeDate(new Date((short) 1, (short) 2, 1985));
    teste.afterDate(new Date((short) 1, (short) 2, 1921));

    Date jan1969 = new Date((short) 18, 1, 1969);
    Date jan2019 = new Date((short) 18, 1 ,2019);
    long days_v1 = jan1969.diferenceDays(jan2019);
    long days_v2 = Date.daysCrawlerRecursive(jan1969, jan2019);
    System.out.println(jan1969 + ":" + jan2019 + "> DiffDays:" + days_v1);
    System.out.println(jan1969 + ":" + jan2019 + "> DiffDays (Recursive):" + days_v2);
  }

  @Override
  public String toString() {
    return "Date{" +
            "day=" + day +
            ", month=" + month +
            ", year=" + year +
            '}';
  }
}