public class Journal extends Publication{
    
    private String journalName;
    private Double impactFactor;

    public Journal(String jName, Double impFact){

        this.journalName = jName;
        this.impactFactor = impFact;
    }

    public Double computeScore(){
        return (this.impactFactor * 0.5) / numberOfAuthors;
    }
}