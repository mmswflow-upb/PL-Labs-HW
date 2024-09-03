import java.util.Scanner;


public class PerfectNums{

    public static void main(String[] args){

        System.out.println("Type a number to find all perfect numbers up to it: ");
        int inp_num = new Scanner(System.in).nextInt();

        int[] perfectNums = new int[inp_num];

        for (int i = 1; i < inp_num; i++){

            if (isPerfect(i) == true){

                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int n){
        
        int sum = 0;

        for (int i = 1; i < n; i++){

            if (n%i == 0){

                sum += i;
            }
        }
        return (sum == n);
    }

}