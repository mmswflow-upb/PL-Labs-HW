import java.util.Scanner;

public class HW9{

    public static void main(String[] args){
        
        University uni = new University("UPB", "Bucharest");

        Author auth1 = new Author("Constantin Viorel Marian");
        Author auth2 = new Author("Vladimir Balan");
        
        Journal journ1 = new Journal("Debian 11", 0.5);
        Journal journ2 = new Journal("Kali Linux", 0.4);
        
        Journal journ3 = new Journal("Statistics", 0.5);
        Journal journ4 = new Journal("Differential Geometry", 0.5);

        ConferenceProceeding conf1 = new ConferenceProceeding("", true);
        ConferenceProceeding conf2 = new ConferenceProceeding( "", false);

        ConferenceProceeding conf3 = new ConferenceProceeding( "",true);
        ConferenceProceeding conf4 = new ConferenceProceeding( "",false);

        auth1.addPublication(journ1);
        auth1.addPublication(journ2);
        auth1.addPublication(conf1);
        auth1.addPublication(conf2);

        auth2.addPublication(journ3);
        auth2.addPublication(journ4);
        auth2.addPublication(conf3);
        auth2.addPublication(conf4);

        uni.addAuthor(auth1);
        uni.addAuthor(auth2);

        System.out.println("The total score of " + uni.getName() + " is: " + uni.computeScore());
    }
}