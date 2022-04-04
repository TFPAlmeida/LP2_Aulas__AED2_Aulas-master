package edu.ufp.inf.lp2.aulas.pl._5_bt;

import edu.ufp.inf.lp2._1_intro.Date;

public abstract class PenaltyFee implements Comparable<PenaltyFee>, Offense {

  private String motive;

  private String local;

  public static float MIN_VALUE = 20.0f;

  public static int MIN_PUNISHMENT = 15;

  private Date date;

    private Vehicle vehicle;
    private Driver driver;
  
}