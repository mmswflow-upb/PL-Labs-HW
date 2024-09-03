import java.lang.reflect.Array;

public class University{
    
    private String name;
    private String location;
    private Author[] authors = new Author[0];

    public University(String nm, String loc){

        this.name = nm;
        this.location = loc;
        this.authors = new Author[10];
    }

    public String getName(){

        return this.name;

    }

    public void addAuthor(Author aut){

        Author[] newAuths = new Author[this.authors.length+1];

        for (int i = 0; i < this.authors.length; i++){

             newAuths[i] = this.authors[i];
        }
        newAuths[newAuths.length - 1] =  aut;
        this.authors = newAuths;
    }
    public Double computeScore(){

        Double sum = 0.0;

        for (int i = 0; i < this.authors.length; i++){

            if (this.authors[i] != null){

                sum += this.authors[i].computeScore();
            }
        }
        return sum;
    }
}