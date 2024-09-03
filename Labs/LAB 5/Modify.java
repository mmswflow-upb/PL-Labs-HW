import java.util.Scanner;

public class Modify{

    public static void main(String[] args){

        System.out.println("Insert a string: ");
        String str = new Scanner(System.in).nextLine();

        modify(str);
    }

    public static void modify(String s){
       
        int mid = s.length()/2;

        String newStr = "";

        for (int i = 0; i < mid ; i++){

            newStr += s.charAt(i);
            newStr += s.charAt(s.length() - i - 1);
        }

        System.out.println(newStr);

    }
}