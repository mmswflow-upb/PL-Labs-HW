public class Monitor extends HardwareProduct{


    static Double currency = 4.55;
    static int maximumScore = 150;



    public Monitor(Double currenP, Double sc) {
        super(currenP, sc);
        
    }

    public void computePriceInLei(){

        super.leiPrice = currency*super.currencyPrice;
    }

    public void computePerformance(){

        super.performance = super.score/maximumScore*100;
    }
    
    
}