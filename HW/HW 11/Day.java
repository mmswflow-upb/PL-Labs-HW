public class Day{

    private int month = 0;
    private Double high = 0.0;
    private Double low = 0.0;
    private int snow = 0;
    private int precipitation = 0;
    
    
    public Day(int m, Double h, Double l, int p, int s){
        
        this.month = m;
        this.high = h;
        this.low = l;
        this.precipitation = p;
        this.snow = s;
    }

    public Double getHigh(){

        return this.high;
    }
    public Double getLow(){

        return this.low;
    }
    public int getSnow(){

        return this.snow;
    }
    public int getPrecipitation(){

        return this.precipitation;
    }
    public int getMonth(){

        return this.month;
    }
}