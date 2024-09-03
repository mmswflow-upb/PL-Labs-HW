import java.util.Scanner;

public class Palindrome{
   
    public static void main(String[] args){

        System.out.println("Type in your string: ");
        String inp_str = new Scanner(System.in).nextLine();

        System.out.println(isPalindrome(inp_str));

        System.out.println("RECURSIVE: " + isPalindrome(inp_str));
    }

    public static boolean recursiveIsPalindrome(String str){

        Boolean res = true;

        if (str.length() == 0){

            return res;
        }
        if (str.charAt(0) != str.charAt(str.length()-1)){

            return false;
        }else{

            String newStr = str.substring(1, str.length()-1);
            res = recursiveIsPalindrome(newStr);
        }

    }

    public static boolean isPalindrome(String str){
    
        int mid = str.length()/2;

        for (int v = 0; v < mid; v++){

            if (str.charAt(v) != str.charAt(str.length() -v -1)){

                return false;
            }
        }
        return true;
    }
}