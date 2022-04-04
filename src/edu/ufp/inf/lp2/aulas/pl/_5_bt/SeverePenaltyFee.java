package edu.ufp.inf.lp2.aulas.pl._5_bt;

import edu.ufp.inf.lp2.aulas.pl._1_intro.Date;

public class SeverePenaltyFee extends PenaltyFee {

  public static String PARKING_VIOLATION = "PARKING_VIOLATION";
  public static String PROHIBITION_ON_OVERTAKING = "PROHIBITION_ON_OVERTAKING";

  public SeverePenaltyFee(Date data, String razao, String local) throws SeverePenaltyFee{
    super(data, razao, local);
    if(!(razao.equals(PARKING_VIOLATION) || razao.equals(PROHIBITION_ON_OVERTAKING))){
      throw new SeverePenaltyFee("Razao Invalida");
    }
  }

  public SeverePenaltyFee(Date data, String razao, String local, Driver condutor, Vehicle veiculo) {
    super(data, razao, local, condutor, veiculo);
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