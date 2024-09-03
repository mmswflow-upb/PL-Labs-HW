import java.util.Scanner;

public class Lab_ex1{

    public static void main(String[] args){

        System.out.println("Insert the maximum number: ");
        int inp_num = Integer.parseInt(new Scanner(System.in).nextLine());

        fibIterative(inp_num);
        System.out.println("RECURSIVE: The Fibonacci number: " + inp_num + " is: " + fibRecursive(inp_num));
       
        
    }

    public static int fibRecursive(int n){

        if (n == 0){

            return 0;
            
        }else if(n == 1 || n == 2){

            return 1;
        }

        
        return fibRecursive(n-1) + fibRecursive(n - 2);

    }

    public static void fibIterative(int n){

        int fibNum = 0;
        int num1 = 0,num2 = 1;

        for (int i = 0; i < n-1; i++){

            fibNum = num1 + num2;
            num1 = num2;
            num2 =  fibNum; 
        }
        
        if (n == 1 || n == 2){

            fibNum = 1;
        }

        System.out.println("ITERATIVE: The Fibonacci number " + n + " is: " + fibNum);
        
    }

}