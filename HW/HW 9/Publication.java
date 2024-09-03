import java.util.Calendar;

abstract class Publication{
    
    protected String name;
    protected Calendar apparition;
    static int numberOfAuthors;
  


    abstract Double computeScore();

}