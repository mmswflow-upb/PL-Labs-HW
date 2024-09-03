public class Fleet{

    private Car town;
    private Car suv;

    public Fleet(double Car1StartOdo, Double Car1EndOdo, Double Car1Liters, Double Car2StartOdo, Double Car2EndOdo, Double Car2Liters){

        town = new Car(Car1StartOdo,Car1EndOdo,Car1Liters);
        suv = new Car(Car2StartOdo,Car2EndOdo,Car2Liters);
    }

    public Double averageConsumption(){

        return (town.computeConsumption()+suv.computeConsumption())/2;
    }
}