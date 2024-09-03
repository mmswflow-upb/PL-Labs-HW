import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        int maxT = 0;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526

            if (i == 0){

                maxT = t;

            }else{

                if (Math.abs(t) < Math.abs(maxT)){

                    maxT = t;
                }else if (Math.abs(t) == Math.abs(maxT)){

                    maxT = Math.max(t,maxT);
                }
            }
        }
        System.out.println(maxT);
    }
}