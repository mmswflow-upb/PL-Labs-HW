import java.io.*;

public class Exercise2{
    
    public static void main(String[] args){

        try{

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mario Sakka\\Desktop\\JavaProgramsCollege\\LAB 12\\numbers.txt"));

            String line;
            
            Double sum = 0.0;
            int max = 0;
            int min = 0;
            int l = 0;

            while ((line = reader.readLine()) != null){

                String[] nums = line.split("\\s+");

               
                min = Integer.parseInt(nums[0]);
                max = Integer.parseInt(nums[0]);


                for (int i = 0; i < nums.length; i++){

                    l++;
                    sum+= Integer.parseInt(nums[i]);    

                    if (Integer.parseInt(nums[i]) > max){

                        max = Integer.parseInt(nums[i]);
                    }
                    if (Integer.parseInt(nums[i]) < min){
                        min = Integer.parseInt(nums[i]);
                    }
                }
            }

            System.out.println("The maximum number: " + max + "\nMinimum Number: " + min + "\nAverage: " + (sum/l));

        }catch (IOException e){

            e.printStackTrace();
        }
    }

}