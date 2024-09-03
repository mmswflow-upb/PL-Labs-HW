import java.io.*;

public class Exercise4{

    public static void main(String[] args){

        try{

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mario Sakka\\Desktop\\JavaProgramsCollege\\LAB 12\\test.txt"));
    
            String line;
    
            String[] lines = new String[0];
    
            while ((line = reader.readLine()) != null){
    
                String[] newLines = new String[lines.length+1];
    
                for (int i = 0; i < lines.length; i++){
    
                    newLines[i] = lines[i];
    
                }
                newLines[lines.length] = line;
                lines = newLines;
            }
    
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Mario Sakka\\Desktop\\JavaProgramsCollege\\LAB 12\\result2.txt"));
    
            for (int i = lines.length-1; i >= 0; i--){
    
                bw.write(lines[i]);
                bw.newLine();
            }
    
            bw.close();
    
        }catch (IOException e){
    
            e.printStackTrace();
        }

    }
    

}