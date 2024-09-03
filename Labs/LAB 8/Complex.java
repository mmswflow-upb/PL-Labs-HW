public class Complex{


    private Double realPart;
    private Double imCoeff;
    private String img = "*i";

    public Complex(){

        realPart = 0.0;
        imCoeff = 0.0;

    }

    public Complex(Double a, Double b){

        this.realPart = a;
        this.imCoeff = b;
    }

    public void complexAdd(Complex num){

        this.realPart += num.realPart;
        this.imCoeff += num.imCoeff;
        simplify();
    }

    public void complexSub(Complex num){

        this.realPart -= num.realPart;
        this.imCoeff -= num.imCoeff;
        simplify();
    }

    public void complexMult(Complex amp){

        Double num1 = this.realPart*amp.realPart;
        Double num2 = this.realPart*amp.imCoeff;
        Double num3 = this.imCoeff*amp.realPart;
        Double num4 = this.imCoeff*amp.imCoeff;
        
            this.imCoeff = num2 + num3;
            num4 = -1*num4;
            this.realPart = num4 + num1;
     

        simplify();
    }
    public void complexDiv(Complex div){

        Double commonDenum = Math.pow(div.realPart,2) + Math.pow(div.imCoeff,2);

        div.imCoeff = -1*div.imCoeff;
        
        this.complexMult(div);
      
        this.realPart /= commonDenum;
        this.imCoeff /= commonDenum;

        simplify();
    }

    public String tupleFormat(){

        String s = this.realPart + " + "+this.imCoeff+img;
        return s;
    }
    public void simplify(){

        if (this.imCoeff == 0){

            img = "";
        }else{
            img = "*i";
        }
    }
}