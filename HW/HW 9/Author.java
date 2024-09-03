public class Author extends Publication{
    
    private String name;
    private Publication[] publications = new Publication[0];

    public Author(String nm){

        this.name = nm;
        numberOfAuthors++;
    }

    public void addPublication(Publication pub){

        Publication[] newPubs = new Publication[this.publications.length+1];

        for (int i = 0; i < this.publications.length; i++){

            newPubs[i] = this.publications[i];
        }
        newPubs[newPubs.length - 1] =  pub;
        this.publications = newPubs;
    }

    public Double computeScore(){

        Double sum = 0.0;

        for (int i = 0; i  < this.publications.length; i ++){

            sum += this.publications[i].computeScore();
        }
        return sum;
    }
}