public class CarTest{
    
    public static void main(String[] args){

        Car myCar1 = new Car(500.0,1000.4,150.5);
        Car myCar2 = new Car(600.0,700.0,30.0);

        System.out.println("The consumption of car 1 is: " + myCar1.computeConsumption() + " Lit/100KM");
        System.out.println("The consumption of car 2: " + myCar2.computeConsumption() + " Lit/100KM");
    }
}