import java.util.Scanner;

public class Lab_Ex2{
    public static void main(String[] args){

        System.out.println("Please insert the integers A,B:");
        String inp = new Scanner(System.in).nextLine();

        int indOfCom = inp.indexOf(",");

        int num1 = Integer.parseInt(inp.substring(0,indOfCom));
        int num2 = Integer.parseInt(inp.substring(indOfCom+1, inp.length()));
        
        int nwNum1,nwNum2,len;

        if (num1 > num2){//We first find which is the greatest number.
         
            nwNum1 = num1;
            nwNum2 = num2;

        }else{
            nwNum1 = num2;
            nwNum2 = num1;
        }
        len = nwNum2;

        for (int i = 0; i < len; i++){

            if (nwNum1%nwNum2 == 0){

                System.out.println("The greatest common divisor is: " + nwNum2);
                break;

            }else{

                num2 = nwNum2;
                num1 = nwNum1;

                nwNum1 = nwNum2;
                nwNum2 = num1%num2;

            }

        }
    }
}