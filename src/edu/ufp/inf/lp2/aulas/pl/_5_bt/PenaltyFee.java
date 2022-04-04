package edu.ufp.inf.lp2.aulas.pl._5_bt;

import edu.ufp.inf.lp2.aulas.pl._1_intro.Date;

import java.util.Objects;

public abstract class PenaltyFee implements Comparable<PenaltyFee>, Offense {

  private String motive;
  private String razao;
  private String local;



  public static float MIN_VALUE = 20.0f;

  public static int MIN_PUNISHMENT = 15;

  private Date date;

    private Vehicle vehicle;
    private Driver driver;

  public PenaltyFee(Date data, String razao, String local) {
  }

  public PenaltyFee(Date data, String razao, String local, Driver condutor, Vehicle veiculo) {
  }

  @Override
  public int compareTo(PenaltyFee m) {
    if (this.getDriver().getDriverLicense().compareTo(m.getDriver().getDriverLicense()) == 0
            && this.getVehicle().getRegistration().compareTo(m.getVehicle().getRegitration()) == 0
            && this.getDate().compareTo(m.getDate()) == 0
            && this.getLocal().compareTo(m.getLocal()) == 0
            && this.getMotive().compareTo(m.getMotive()) == 0) {
      return 0;
    }
    return (this.date.beforeDate(m.date)?-1:1);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PenaltyFee that = (PenaltyFee) o;
    return Objects.equals(date, that.date) && Objects.equals(motive, that.motive) && Objects.equals(local, that.local);
  }

  public String getMotive() {
    return motive;
  }

  public void setMotive(String motive) {
    this.motive = motive;
  }

  public String getRazao() {
    return razao;
  }

  public void setRazao(String razao) {
    this.razao = razao;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }
}