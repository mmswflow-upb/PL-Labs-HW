public class AccidentInsurance extends Insurance{

    public AccidentInsurance(String fN, String lN, String ad, int num, String freq) {
        super(fN, lN, ad, num, "half-yearly");
    }
    public AccidentInsurance(String fN, String lN, String ad, int num) {
        super(fN, lN, ad, num);
    }

    public void computeAmountPerPeriod(){

        super.amountPerPeriod = 13.0*5/100;
    }
}