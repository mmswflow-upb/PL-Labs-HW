public class TestComplex{

    public static void main(String[] args){

        Complex num1 = new Complex(2.0,3.0);
        Complex num2 = new Complex(4.0,5.0);

        Complex num3 = new Complex(2.0,3.0);
        Complex num4 = new Complex(4.0,5.0);

        num1.complexMult(num2);

        System.out.println("The first complex number after multiplication is: " + num1.tupleFormat());

        num3.complexDiv(num4);

        System.out.println("The Third complex number after division over the fourth: " + num3.tupleFormat());
    }
}