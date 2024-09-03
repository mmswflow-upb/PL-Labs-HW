public class FormTest{

    public static void main(String[] args){

        Form[] graphics = new Form[3];
        
        Point myPoint = new Point(0, 5);
        Circle myCircle = new Circle(5, 0 , 5);
        Cylinder myCyl = new Cylinder(5, 5, 0, 5);

        graphics[0] = myPoint;
        graphics[1] = myCircle;
        graphics[2] = myCyl;
        
        //Circle area is:  78.5398163 m2
        //Cylinder surface area is: 314.159 m2
        //Cylinder Volume is: 392.69875 m3

        System.out.println("Point is: " + graphics[0].toString());
        System.out.println("The Area of the Circle: " + graphics[1].computeArea() + "m^2");
        System.out.println("The Area of the Cylinder is: " + graphics[2].computeArea() + "m^2");
        System.out.println("The Volume of the Cylinder is: " + graphics[2].computeVolume() + "m^3");
    }

}