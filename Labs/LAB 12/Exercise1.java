import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1{
    
    public static String[] entries = new String[0];
  
    public static void main(String[] args){

        try{

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mario Sakka\\Desktop\\JavaProgramsCollege\\LAB 12\\zip.txt"));

            String line;

            int k = 0;

            while ((line = reader.readLine()) != null){

                k++;

                String[] data = line.split(",");

                String[] newArr = new String[k];

                String entry = data[0] + " "+ data[1].trim() + " "+ data[2].trim() + " "+ data[3].trim() + " "+ data[5].trim() + " " + data[6].trim() + " " + data[9];

                for (int i = 0; i < entries.length; i++){

                    newArr[i] = entries[i];
                }
                newArr[entries.length] = entry;
                entries = newArr;
            }

        }catch (IOException e){

            e.printStackTrace();
        }
        
        System.out.println("The number of entries is: " + entries.length);

        System.out.println("\nInput a town name and a state [town state]:");
        String[] query = new Scanner(System.in).nextLine().split("\\s+");

       

        for (int i = 0; i < entries.length; i++){

            String[] data = new String[7];

            int k = 0;

            StringTokenizer tokens = new StringTokenizer(entries[i]," ");

            while (k < 7){
                data[k] = tokens.nextToken();
                k++;
            }

            if (data[1].toLowerCase().equals(query[0].toLowerCase()))
            {
                if (data[2].toLowerCase().equals(query[1].toLowerCase())){

                    System.out.println("\nQuery: " + query[0] + ", " + query[1] + "\nFound...");
                    System.out.println("Town: " + data[1] + ", " + data[2] + ", " + data[0] + "(Area Code: " + data[3] +", Time Zone: " + data[5] + ")");
                    System.out.println("County: " + data[4] +", Population: " + data[6]);
                    return;
                }
            }
        }

        System.out.println("Invalid query.");
    }
}