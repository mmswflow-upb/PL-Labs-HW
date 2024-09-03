import java.util.Scanner;
import java.util.Arrays;

public class PrimeNums{

    
    public static void main(String[] args){

        System.out.println("Insert the integer to find out wether it's a prime or not:");
        int num_inp = new Scanner(System.in).nextInt();

        if (isPrime(num_inp)){

            System.out.println(Integer.toString(num_inp) + " is prime.");

        }else {

            System.out.println(Integer.toString(num_inp) + " is not prime");
        }

        System.out.println("Insert a number to find all the prime numbers up to it: ");
        int maxNum = new Scanner(System.in).nextInt();

        int[] primes = listPrimes(maxNum);

        for (int i = 0; i < primes.length; i++){

            System.out.println(primes[i]);    
        }

        System.out.println("Insert a number to find if all its divisors are prime: ");
        int maxNum2 = new Scanner(System.in).nextInt();

        if (allPrimeDivisors(maxNum2) == true){

            System.out.println("All its divisors are prime.");

        }else{

            System.out.println("Not all divisors are prime.");
        }

    }
    public static int[] listPrimes(int num_inp2){

        int[] primes = new int[num_inp2];

        int k = 0;

        for (int i = 0; i < num_inp2; i++){

            if (isPrime(i)){

                primes[k++] = i;
            }
        }
        int[] newPrimes = Arrays.copyOf(primes, k);
        return newPrimes;
    } 

    public static boolean allPrimeDivisors(int max){

        int k = 0;

        int[] divisors = new int[max];
        
        for (int i = 2; i < max; i++){

            if (max % i == 0){

                divisors[k++] = i;
            }
        }

        for (int v = 0; v < k; v++){

            if (isPrime(divisors[v]) == false){

                return false;
            }

        }
        return true;
    }

    public static Boolean isPrime(int num_inp){

        if(num_inp<=1)
        {
            return false;
        }

        for (int i = 2; i <= num_inp/2; i++){

            if (num_inp%i == 0){
                
                return false;
            }
        }
        return true;
    }
}