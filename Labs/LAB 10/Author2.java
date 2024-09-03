public class Author2{
    
    private String name;
    private String email;
    private char gender;

    public Author2(String nm, String em, char gen){

        this.name = nm;
        this.email = em;
        this.gender = gen;
    
    }
    public String getName(){

        return this.name;
    }
    public String getEmail(){

        return this.email;
    }
    public char getGender(){

        return this.gender;
    }

    public void setEmail(String em){

        this.email = em;
    }

    public String toString(){

        return "'"+ this.name + " (" + this.gender +") at" + this.email+"'";
    }
}