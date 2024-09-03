import java.util.Scanner;

public class FindCharacters{

    public static void main(String[] args){

        System.out.println("Insert a string: ");
        String str_inp = new Scanner(System.in).nextLine();

        System.out.println("Insert a character to find out the number of occurences: ");
        String char_inp =  new Scanner(System.in).nextLine();

        System.out.println("The number of occurences is: " + countCharacters(str_inp, char_inp));
        System.out.println("RECURSIVE: The number of occurences is: "+ recursiveCountCharacters(str_inp, char_inp) );
    }

    public static int recursiveCountCharacters(String str, String c){

        int count = 0;

        if (str.length() == 0){

            return count;
        }

        if (str.substring(0,1).equals(c)){

            return 1 + recursiveCountCharacters(str.substring(1), c);

        }else{

            return recursiveCountCharacters(str.substring(1), c);
        }
    }

    public static int countCharacters(String str, String c){

        int count = 0;

        for (int v = 0; v < str.length(); v++){

            if (c.equals(String.valueOf(str.charAt(v)))){
                count++;
            }
        }
        return count;
    }

}