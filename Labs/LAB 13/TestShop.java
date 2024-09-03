import java.io.*;
import java.util.ArrayList;

public class TestShop{
    
    public static void main(String[] args){
        
        ArrayList<HardwareProduct> products = new ArrayList<HardwareProduct>();

        BufferedReader br;

        try{

            br = new BufferedReader(new FileReader("C:\\Users\\Mario Sakka\\Documents\\PrivateFilesFaculty\\Year I\\Semester I\\PLA\\JavaProgramsCollege\\LAB 13\\PlaciVideo.txt"));

            String line;
            while ((line = br.readLine()) != null){

                

                String[] data = line.split("\\s+");
                VideoCard card = new VideoCard(Double.parseDouble(data[0]), Double.parseDouble(data[1]));
                card.computePerformance();
                card.computePriceInLei();

                products.add(card);
            }

            br = new  BufferedReader(new FileReader("C:\\Users\\Mario Sakka\\Documents\\PrivateFilesFaculty\\Year I\\Semester I\\PLA\\JavaProgramsCollege\\LAB 13\\Monitoare.txt"));

            while ((line = br.readLine()) != null){
                
                String[] data = line.split("\\s+");
                Monitor mon = new Monitor(Double.parseDouble(data[0]), Double.parseDouble(data[1]));
                mon.computePerformance();
                mon.computePriceInLei();

                products.add(mon);
            }

            for (int i = 0; i < products.size(); i++){

             System.out.println(products.get(i));
            }

        }catch (IOException e){

            e.printStackTrace();
        }
    }
}