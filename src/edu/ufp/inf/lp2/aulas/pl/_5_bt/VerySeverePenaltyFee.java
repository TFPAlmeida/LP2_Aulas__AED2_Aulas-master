package edu.ufp.inf.lp2.aulas.pl._5_bt;

import edu.ufp.inf.lp2.aulas.pl._1_intro.Date;

public class VerySeverePenaltyFee extends PenaltyFee {

  public static String SPEEDING = "EXCESS_SPEED";

  public static String DRIVING_UNDER_INFLUENCE = "EXCESS_ALCOOL";

  public VerySeverePenaltyFee(Date data, String razao, String local) throws InvalidPenaltyFeeReasonException{
    super(data, razao, local);
    if(!(razao.equals(SPEEDING) || razao.equals(DRIVING_UNDER_INFLUENCE))){
      throw new InvalidPenaltyFeeReasonException("Razao Invalida");
    }
  }

  public VerySeverePenaltyFee(Date data, String razao, String local, Driver condutor, Vehicle veiculo) throws InvalidPenaltyFeeReasonException {
    super(data, razao, local, condutor, veiculo);
    if (!(razao.equals(SPEEDING) || razao.equals(DRIVING_UNDER_INFLUENCE))) {
      throw new InvalidPenaltyFeeReasonException("Razao invalida");
    }
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