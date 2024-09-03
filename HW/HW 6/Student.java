
public class Student{

    private String name;
    private Double totalPoints;
    private int exams;

    public Student(String name){

        this.name = name;
        this.totalPoints = 0.0;
    }

    public String getName(){

        return this.name;
    }
    public void addExam(Double mark){

        this.totalPoints += mark;
        this.exams++;
    }
    public Double getTotal(){
        return this.totalPoints;
    }
    public Double getMeanMark(){

        return (this.totalPoints/this.exams);
    }
}