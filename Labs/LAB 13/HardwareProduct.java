abstract class HardwareProduct{

    protected Double currencyPrice;
    protected Double leiPrice;
    protected Double score;
    protected Double performance;

    public HardwareProduct(Double currenP, Double sc){

        this.currencyPrice = currenP;
        this.score = sc;
    }

    public abstract void computePerformance();

    public Double computeRatioLeiPerformance(){

        return this.leiPrice/performance;
    }

    public String toString(){

        return this.getClass().toString() + "  Price in Lei:  " + this.leiPrice + "\nPerformance:  " + this.performance + "\nRatio Price/Perf:  " + this.computeRatioLeiPerformance() + "\n_______________";
    }
}