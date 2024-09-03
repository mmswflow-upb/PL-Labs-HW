public class TestRational{
    
    public static void main(String[] args){

        Rational rat1 = new Rational(14,17);
        Rational rat2 = new Rational(5,9);
        Rational rat3 = new Rational(5,6);

        System.out.println("The first rational is: " + rat1.intFormat());
        System.out.println("The second rational is: " + rat2.intFormat());

        rat1.sub(rat2);

        System.out.println("The new first rational is: " + rat1.intFormat());
        
        rat2.mult(rat3);
        System.out.println("Rational new Number 2 is: " + rat2.intFormat());
    }
}