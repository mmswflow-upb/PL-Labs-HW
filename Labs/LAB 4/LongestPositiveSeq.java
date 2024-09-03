import java.beans.Transient;
import java.lang.annotation.Native;

public class LongestPositiveSeq{

    public static void main(String[] args){

        
        int[] seq = {0,1,2,3,-900,5,786,-95,5,6,7,8,-90,9,0,1,90,-9,-2};
        
        int seqLen = 0,firstInd = 0;
        
        int[] lps = longestPositiveSeq(seq, 0);

        firstInd = lps[0];
        seqLen = lps[1];

        if (seqLen > 1){

            System.out.println("The length of LPS: " + seqLen);
            System.out.println("The beginning index of LPS: " + firstInd);
            printList(seq,firstInd,seqLen);

        }else{

            System.out.println("There is no positive sequence.");
        }
    }
    public static int[] longestPositiveSeq(int[] seq, int ind){

        int lastStart = 0,lastLen = 0, currLen = 0, currStart = 0;

        for (int i = 0; i < seq.length; i++){

            if (seq[i] >= 0){

                currLen++;

                if (currLen == 1){

                    currStart = i;
                }

            }else{

                if (currLen > lastLen){

                    lastStart = currStart;
                    lastLen = currLen;
                }
                currLen = 0;
                currStart = 0;
            }
        }

        int[] result = {lastStart,lastLen};
        return result;
    }
    public static void printList(int[] seq, int start, int end){

        String row = "";

        for (int i = start; i <= end+start-1; i++){

          row += seq[i] + " ";  
        }
        System.out.println(row);
    }
}