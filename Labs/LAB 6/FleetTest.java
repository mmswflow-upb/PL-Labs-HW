public class FleetTest{

    public static void main(String[] args){

        Fleet myFleet = new Fleet(5.0,10.0,1.0,10.0,15.0,7.0);

        System.out.println("The average consumption of the fleet is: " + myFleet.averageConsumption() + " Lit/100KM");
    }

}