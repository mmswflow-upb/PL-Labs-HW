public class Rational{

    private int numerator;
    private int denominator;

    public Rational(){

        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int a, int b ){

        if (b == 0){

            b = 1;
        }else{

            this.numerator = a;
            this.denominator = b;
        }
        simplify();        
    }

    public void simplify(){

        int cd = gcd(this.numerator, this.denominator);

        if (cd > 1){

            this.numerator /= cd;
            this.denominator /= cd;
        }
    }

    public static int findGCD(int a, int b){

        int res = 1;

        for (int i = b; i > 0; i--){

            if (a%b != 0){

                System.out.println("iteration : " + i + " gcd = " + res);

                a = b;
                b = a%b;

            }else{
                res = i;
            }
        }

        return res;
    }

    private int gcd(int a, int b){

        int res = 1;
        int temp = 0;

        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = b; i > 0; i--){

            if (a%b != 0){

                temp = a;
                a = b;
                b = temp%b;

            }else{
                res = b;
                break;
            }
        }

        return res;
    }
    public void division(Rational divisor){

        this.numerator*= divisor.denominator;
        this.denominator *= divisor.numerator;

        simplify();
    }

    public void mult(Rational amp){

        this.numerator *= amp.numerator;
        this.denominator *= amp.denominator;

        simplify();
    }
    public void add(Rational rat){

        int tempDenom = this.denominator;

        this.numerator *= rat.denominator;
        this.denominator *= rat.denominator;

        rat.numerator *= tempDenom;
        rat.denominator *= tempDenom;

        this.numerator += rat.numerator;
        
        simplify();

    }


    
    public String intFormat(){

        String s = String.valueOf(numerator) + "/"+String.valueOf(denominator);

        return s;
    }
    public Double realFormat(){

        return (this.numerator/this.denominator);
    }
    public void sub(Rational rat){

        int tempDenom = this.denominator;

        this.numerator *= rat.denominator;
        this.denominator *= rat.denominator;

        rat.numerator *= tempDenom;
        rat.denominator *= tempDenom;

        this.numerator -= rat.numerator;
        
        simplify();

    }
}
