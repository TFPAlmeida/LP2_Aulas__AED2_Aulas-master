package edu.ufp.inf.lp2.aulas.pl._5_bt;

import edu.ufp.inf.lp2.aulas.pl._1_intro.Date;

public class VerySeverePenaltyFee extends PenaltyFee {

  public static String SPEEDING = "EXCESS_SPEED";

  public static String DRIVING_UNDER_INFLUENCE = "EXCESS_ALCOOL";

  public VerySeverePenaltyFee(Date data, String razao, String local) {
  }

  @Override
  public void value() {
    
  }

  @Override
  public void punishment() {

  }

  @Override
  public int compareTo(PenaltyFee o) {
    return 0;
  }
}