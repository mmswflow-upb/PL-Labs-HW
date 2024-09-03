import java.util.Random;
import java.util.Scanner;

public class HW13{
    
    public static void main(String[] args){


        System.out.println("\n\nExercise One:");
        exerciseOne();

        System.out.println("\n\nExercise Two:");
        exerciseTwo();

        System.out.println("\n\nExercise Three:");
        exerciseThree();

        System.out.println("\n\nExercise Four:");
        exerciseFour();

        System.out.println("\n\nExercise Five:");
        exerciseFive();

        System.out.println("\n\nExercise Six:");
        exerciseSix();
    }

    public static void exerciseOne(){

        String[] colorBand = {"Blue","Orange","Yellow","Blue","Orange","Yellow","Green","Red","Red","Purple","Orange","Pink","Red","Purple","White","Orange"};
        //The result should be: Cut 1 from left.
        //The size of our colorBand is 16 bands
        //The length of our new colorBand is 15

        String[] tempBand = colorBand.clone();
        int[][] diff = new int[0][3];

        for (int i = 0; i < colorBand.length; i++){//Take biggest differences between duplicate colors

            if (tempBand[i] != ""){
                
                /*We have to check for zeroes, because after we take the difference for a certain color
                We nullify them ( turn them to 0 ) and never check them again.*/

                String temp = tempBand[i];
                int d = 0;
                int start = 0;
                int end = 0;

                tempBand[i] = "";

                for (int v = 0; v < colorBand.length; v++){

                    if (temp == tempBand[v]){//We check if we find the same color again.

                        tempBand[v] = "";
                        if (Math.abs(i-v) > d){
                        
                        //We check if the distance between them is greater than the distance between the previous pair.

                            d = Math.abs(i-v);
                            start = i;
                            end = v;
                        }
                    }
                }
                int[][] newDiff = new int[diff.length+1][3];
                //We add the new array corresponding to the recently investigated color into the diff array.

                for (int x = 0; x < diff.length; x++){
                    newDiff[x] = diff[x];
                }

                int[] tempList = {start,end,d};
                newDiff[diff.length] = tempList;
                diff = newDiff;
            }
        }

        int[] maxDiff = diff[0];
    

        for (int c = 1; c < diff.length; c++){

            if (diff[c][2] > maxDiff[2]){

                maxDiff = diff[c];
            }
        }

        int leftCut = maxDiff[0];
        int rightCut = colorBand.length -1 - maxDiff[1];

        System.out.println("Cut from the left end: " + leftCut + "  and from the right end: " + rightCut);
        System.out.println("Our Band is : " + (colorBand.length-leftCut-rightCut) + " Units long");
        
        String newColorBand = "";

        for (int i = leftCut; i < colorBand.length - rightCut; i++){

            newColorBand += colorBand[i] + " ";
        }
        System.out.println(newColorBand);

    }

    public static void exerciseTwo()
    {

        System.out.println("Input a number [x]:");
        int n = new Scanner(System.in).nextInt();
        

        System.out.println("Input a maximum number of primes: ");
        int max = new Scanner(System.in).nextInt();
        

        int k = 0;
        int sum = 0;

        for (int i = n; i > 1; i--){

            if (isPrime(i)){

                k = i;
                break;
            }
        }

        int count = 0;//Check how many primes we have found so far
        int z = 0;//increment with 1

        while (count < max){

            z++;

            if (isPrime(n+z)){

                count++;
                sum += n+z;
            }
        }


        if (n >= 2){

            System.out.println("The greatest prime number smaller or equal to given number is: " + k);
        }else{
            System.out.println("No prime number smaller or equal to given number found!");
        }
        System.out.println("The sum of the first " + max + " prime numbers greater than given number: " + sum);
    }

    public static Boolean isPrime(int num){

        for (int i = 2; i <= num/2; i++){

            if (num%i == 0){

                return false;
            }
        }

        return true;
    }

    public static void exerciseThree(){

        System.out.println("Insert a list of natural numbers: [a1 a2 a3 a4..]");
        String inp = new Scanner(System.in).nextLine();
        String[] list = inp.split("\\s+");
        
        System.out.println("Insert a number of prime divisors [k]: ");
        int k = new Scanner(System.in).nextInt();

        int found = 0;
        String result = "";

        for (int i = 0; i < list.length; i++){

            int num = Integer.parseInt(list[i]);
            int divisors = 0;

            for (int z = num-1; z >= 2; z--){

                if (num % z == 0){

                    if (isPrime(z)){
                        divisors++;
                    }
                }
            }

            if (divisors == k){

               result += num + " "; 
               found++;
            }
        }

        System.out.println("We have found " + found + " numbers in the list with " + k + " prime divisors:");
        System.out.println(result);
        
    }

    public static void exerciseFour(){
       
        Double[] pencils = {9.91,0.5,12.3,13.0,0.49,8.92,19.0,15.0};
        //Result should be: 0.5 & 0.49

        Double p1 = pencils[0];
        Double p2 = pencils[1];

        Double diff = Math.abs(p1-p2);//We save the absolute value of the difference, because we don't want neagtive lengths.

        for (int i = 0; i < pencils.length; i++){

            for (int v = 0; v < pencils.length; v++){

                if (Math.abs(pencils[i]-pencils[v])< diff && (i != v)){

                    p1 = pencils[i];
                    p2 = pencils[v];
                    diff = Math.abs(p1-p2);
                }
            }
        }

        System.out.println("The 2 most symmetric pencils are: " + p1 + " & " + p2);

    }

    public static void exerciseFive(){

        /*
        * An ascending sequence of numbers with N elements is given. 
        * You are asked to answer M questions of the type: 
        * 0 x - the highest position on which an element with the value x is located, 
        * or -1 if this value is not found in the string 1 x - the highest position on which a element with value less than or equal to x in the string. 
        * The smallest number in the string is guaranteed to be less than or 
        * equal to x 2 x - the smallest position in the string where an element with a value greater than or equal to x is located. 
        * The largest number in the string is guaranteed to be greater than or equal to x.

        */


    }

    public static void exerciseSix(){

        int day = 0;
        int[] flowers = {9,1,2,3,4,5,12,5,1};

        int s = 0;

        System.out.println("Input a Height Limit:");
        int h = new Scanner(System.in).nextInt();

        

        int maxFlower = flowers[0];

        for (int i = 1; i < flowers.length; i++){

            if (flowers[i] > maxFlower){

                maxFlower = flowers[i];
            }
        }

        if (maxFlower >= h-1){
            
            System.out.println("Flowers might reach that height or exceed it.");
            return;
        }

        int maxDays = h-maxFlower-1;

        Random randomGen = new Random();
        
        while (day < maxDays){

            day++;
            for (int i = 0; i < day; i++){

                int randNum = randomGen.nextInt(flowers.length);
                flowers[randNum] += 1;
            }
            
            System.out.println("Day " + day + ":" );
            displayArray(flowers);
        }

        for (int x = 0; x < flowers.length; x++){

            s += flowers[x];
        }

        System.out.println("The sum of heights of all plants: " + s);
    }
    
    public static void displayArray(int[] arr){

        String line = "";
        for (int z = 0 ; z < arr.length; z++){
            line +=  arr[z] + " ";
        }
        System.out.println(line);
    }
}