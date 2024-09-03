public class LifeInsurance extends Insurance{

    public LifeInsurance(String fN, String lN, String ad, int num, String freq) {
        super(fN, lN, ad, num, "quarterly");
    }
    public LifeInsurance(String fN, String lN, String ad, int num) {
        super(fN, lN, ad, num);
    }

    public void computeAmountPerPeriod(){

        super.amountPerPeriod = 13.0*2/100;
    }

}