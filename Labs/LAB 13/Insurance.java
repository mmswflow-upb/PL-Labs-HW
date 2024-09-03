abstract class Insurance{
    
    private static int id = 0;
    private int number;
    private String firstName;
    private String lastName;
    private String address;
    protected Double amountPerPeriod;
    protected String frequency = "month";
    private Double sum = 0.0;

    public Insurance(String fN, String lN, String ad, int num){

        id++;
        this.firstName = fN;
        this.lastName = lN;
        this.address = ad;
        this.number = num; 
    }
    public Insurance(String fN, String lN, String ad,int num, String freq){

        id++;
        this.firstName = fN;
        this.lastName = lN;
        this.frequency = freq;
        this.address = ad;
        this.number = num;
    }
  //gg man
    public abstract void computeAmountPerPeriod();

    public void computeSum(){

        sum += amountPerPeriod;
    }

    public Double getSum(){

        return this.sum;
    }

    public String getFrequency(){

        return this.frequency;
    }

    public String toString(){

        return "ID: " + id + "\nPolicy Number: " + this.number + "\nLast Name: " + this.lastName + "\nFirst Name: " + this.firstName + "\nAddress: " +this.address + "\nFrequency: " + this.getFrequency() + "\nSum: " + this.sum+"\n__________";
    }
}