import java.util.StringTokenizer;
import java.util.Arrays;

public class Lab4_Ex2 {
    public static void main(String []args) {
    
     String str_norm = "A,C,D,F,E,G,B,J,K,I,L,M,N,O,P,Q";

     StringTokenizer tokens = new StringTokenizer(str_norm,",");

     String[] orderedWords = new String[tokens.countTokens()];

     System.out.println("The words in a sorted order:");

     int ind = 0;

     String temp;
     String lastWord;


     while (tokens.hasMoreTokens()){

        orderedWords[ind++] = tokens.nextToken();
     }

     for (int i = 0; i < orderedWords.length; i++){

        lastWord = orderedWords[i];

        for (int v = i + 1; v < orderedWords.length; v++){

            if (lastWord.compareTo(orderedWords[v]) > 0){

                temp = orderedWords[i];
                orderedWords[i] = orderedWords[v];
                orderedWords[v] = temp;
            }
        }
     }

     for (int i = 0; i < orderedWords.length; i++){

        System.out.println(orderedWords[i]);
     }
    }
}
 