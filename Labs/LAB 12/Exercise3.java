import java.io.*;

public class Exercise3{
    
    public static void main(String[] args){

        try{

            
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mario Sakka\\Desktop\\JavaProgramsCollege\\LAB 12\\numbers.txt"));

            String line;

            while ((line = reader.readLine()) != null){

                String[] nums = line.split("\\s+");

                
                for (int i = 0; i < nums.length-1; i++){

                    for (int z = 0; z < nums.length-i-1; z++){

                        String temp = nums[z];

                        if (Integer.parseInt(nums[z]) > Integer.parseInt(nums[z+1])){

                            nums[z] = nums[z + 1];
                            nums[z + 1] = temp;
                        }

                    }
                }

                try {

                    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Mario Sakka\\Desktop\\JavaProgramsCollege\\LAB 12\\result1.txt"));

                    for (int i = 0; i < nums.length; i++){

                        bw.write(nums[i] + " ");
                        
                    }

                    bw.close();

                }catch (IOException e){

                    e.printStackTrace();
                }

                
            }

        }catch (IOException e){

            e.printStackTrace();
        }
    }

}