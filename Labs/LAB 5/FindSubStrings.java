import java.util.Scanner;

public class FindSubStrings{

    public static void main(String[] args){

        System.out.println("Insert a string: ");
        String str = new Scanner(System.in).nextLine();

        System.out.println("Insert a pattern: ");
        String sub = new Scanner(System.in).nextLine();

        System.out.println("The number of occurrences is: " + recursiveMatch(str,sub));
        System.out.println("ITERATIVE: The number of occurences is : " + match(str,sub));
    }
    public static int match(String s1, String s2){

        int occ = 0;
        int it = s1.length()/s2.length();

        String temp = "";


        for (int i = 0; i <= it ; i++){

            System.out.println(i);

            if (s1.length() == 0){

                return occ;
            }

            temp = s1.substring(0,s2.length());

            if (temp.equals(s2)){

                occ++;
            }

            s1 = s1.substring(s2.length());
        }
        return occ;
    }

    public static int recursiveMatch(String s1, String s2){

        int occ = 0;
        int patLen = s2.length();

        if (s1.length() < patLen){

            return occ;
        }

        if (s1.substring(0,patLen).equals(s2)){

            occ++;
        }
        return occ + recursiveMatch(s1.substring(patLen),s2);
    }
}