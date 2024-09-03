import java.lang.Math;

public class Lab_ex3{

    public static void main(String[] args){

        int[] l = {1,5,43,89,0,12,345,283,9,10,900,-100,-290,8593,99999,-314142};

        int lastMax = 0;
        int lastMin = 0;


        for (int index = 0; index < l.length-1 ; index++){

            int newMax = Math.max(l[index],l[index+1]);
            int newMin = Math.min(l[index],l[index+1]);

            if (newMax > lastMax){

                lastMax = newMax;
            }
            if (newMin < lastMin){

                 lastMin = newMin;
            }
        }
        System.out.println("The biggest integer in the list is: " + lastMax);
        System.out.println("The smallest integer in the list is: " + lastMin);
    }

}