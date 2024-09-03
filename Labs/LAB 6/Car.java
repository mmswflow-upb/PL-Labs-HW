public class Car{

    private Double startKm;
    private Double endKm;
    private Double liters;


    public Car(Double startOdo, Double endOdo, Double litersUsed){

        this.startKm = startOdo;
        this.endKm = endOdo;
        this.liters = litersUsed;
    }

    public Double computeConsumption(){
        
        Double dist = (this.endKm-this.startKm);

        return (dist/this.liters)/100;
    }
}