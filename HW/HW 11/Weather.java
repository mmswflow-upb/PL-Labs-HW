import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Weather{

    static Year[] years = new Year[0];

    //The format is: Month__DayInMonth__Year__HighTemp__LowTemp__Precipitation__Snow
    public static void main(String[] args){

        BufferedReader reader;
        try {

            reader = new BufferedReader(new FileReader("C:\\Users\\Mario Sakka\\Desktop\\JavaProgramsCollege\\HW 11\\weather.txt"));

            String line;
            Year lastYear = new Year(1950);

            while ((line = reader.readLine()) != null){

                String[] data = line.split("\\s+");

                //Date

                int month = Integer.parseInt(data[0]);
                int day = Integer.parseInt(data[1]);
                int year = Integer.parseInt(data[2]);

                //Day Data

                Double highTemp = (Double.parseDouble(data[3]) -32)/1.8;
                Double lowTemp = (Double.parseDouble(data[4]) -32)/1.8;
                int precipitation = Integer.parseInt(data[5]);
                int snow = Integer.parseInt(data[6]);
                
                if (year != lastYear.getYear()){//We have to create a new year object.

                    addYear(lastYear);
                    lastYear = new Year(year);
                }
                lastYear.addDay(day,month, highTemp, lowTemp, precipitation, snow);
                
            }
            addYear(lastYear);
            reader.close();

            //displayAllYears();

            System.out.println("The average Precipication and Snow for every year: \n");
            displayAverages();

            System.out.println("Insert a month and a year: [month year]");
            String inp = new Scanner(System.in).nextLine();

            String[] m_y = inp.split("\\s+");
            
            if (Integer.parseInt(m_y[0]) < 1 || Integer.parseInt(m_y[0]) > 12){

                System.out.println("The month must be in the range 1-12!");
                return;
            }

            if (Integer.parseInt(m_y[1]) > 2001 || Integer.parseInt(m_y[1]) < 1950){


                System.out.println("The year must be in the range 1950-2001!");
                return;
            }

            for (int i = 0; i < years.length; i++){

                if (years[i].getYear() == Integer.parseInt(m_y[1])){
                    
                    System.out.println("The Highest Temperature in " + inp + " is "+ years[i].monthHigh(Integer.parseInt(m_y[0])) + " Celsius\n");
                    System.out.println("The Lowest Temperature in " + inp + " is "+ years[i].monthLow(Integer.parseInt(m_y[0])) + " Celsius\n");
                    break;
                }
            }

        } catch (IOException e) {
            
            e.printStackTrace();
        } 
    }
    
    /*public static void displayAllYears(){

        int k = 0;

        for (int i = 0; i < years.length; i++){


            System.out.println("Year: " + years[i].monthHigh(k++));
        }
    }*/

    public static void displayAverages(){

        for (int i = 0; i < years.length; i++){

            Double snow = years[i].getAverageSnow();
            Double prec = years[i].getAveragePrec();

            System.out.println("Year: " + years[i].getYear() + " Precipitations: " + prec + " & Snow: " + snow + "\n");
        }
    }

    public static void addYear(Year y){

        int len = years.length;

        Year[] newYears = new Year[len+1];

        for (int i = 0; i < len; i++){

            newYears[i] = years[i];
        }
        newYears[len] = y;

        years = newYears;
    }
}
    
