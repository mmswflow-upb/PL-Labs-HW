public class Portfolio{

    
    private int noShares = 0;
    private Share[] shares = new Share[0];

    public Portfolio(){
        
    }

    public void addShare(Share share){

        noShares++;

        Share[] newShares = new Share[noShares];
        
        for (int i = 0; i < noShares-1; i++){

            newShares[i] = this.shares[i];
        }
        newShares[noShares-1] = share;

        this.shares = newShares;
    }

    public Double computeSum(){

        Double sum = 0.0;

        for (int i = 0; i < shares.length; i++){

            sum += this.shares[i].getValue(); 
        }
        return sum;
    }
}