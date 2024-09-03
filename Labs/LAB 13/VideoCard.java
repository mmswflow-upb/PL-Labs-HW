public class VideoCard extends HardwareProduct{

    static Double currency = 4.93;
    static int maximumScore = 100;

    public VideoCard(Double currenP, Double sc) {
        super(currenP, sc);
    }

    public void computePriceInLei(){

        super.leiPrice = currency*super.currencyPrice;
    }

    public void computePerformance(){

        super.performance = super.score/maximumScore*100;
    }
    
}