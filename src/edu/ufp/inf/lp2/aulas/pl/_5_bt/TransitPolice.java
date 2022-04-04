package edu.ufp.inf.lp2.aulas.pl._5_bt;

import edu.ufp.inf.lp2._1_intro.Date;
import java.util.Vector;

public class TransitPolice {

    /**
   * 
   * @element-type PenaltyFee
   */
  public Vector  penaltyFees;

  public void addPenaltyFee(PenaltyFee penaltyFee) {
  /* {exceptions=AlreadyRegisteredMultaException}*/

  }

  public PenaltyFee removePenaltyFee(Date d, String local) {
  return null;
  }

  public ArrayList<PenaltyFee> lookupPenaltyFees(String motive) {
  return null;
  }

  public ArrayList<PenaltyFee> lookupPenaltyFees(Date startDate) {
  return null;
  }

  public int countPenaltyFees(Driver c) {
  return 0;
  }

  public ArrayList<String> allPenaltyFeesMotiveByDriver(Driver d) {
  return null;
  }

  public void seizeLicense(Driver d) {
  }

  public ArrayList<PenaltyFee> lookupPenaltyFeesDriver(Driver d, Date startDate, Date endDate) {
  return null;
  }

  public void lookupSevereAndVerySeverePenaltyFees(String motive) {
  }

}