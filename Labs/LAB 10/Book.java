public class Book{
    
    private String name;
    private Author2 author;
    private Double price;
    private int qtyInStock = 0;

    public Book(String nm, Author2 auth, Double prc){

        this.name = nm;
        this.author = auth;
        this.price = prc;
    }
    public Book(String nm, Author2 auth, Double prc, int quant){

        this.name = nm;
        this.author = auth;
        this.price = prc;
        this.qtyInStock = quant;

    }
    public String getName(){

        return this.name;
    }
    public int getQtyInStock(){

        return this.qtyInStock;
    }
    public Double getPrice(){

        return this.price;
    }
    public Author2 getAuthor(){

        return this.author;
    }
    public void setPrice(Double prc){

        this.price = prc;
    }
    public void setQtyInStock(Double qty){

        this.qtyInStock = qty;
    }

    public String getAuthorName(){

        return this.author.getName();
    }
    public String getAuthorEmail(){

        return this.author.getEmail();
    }
    public char getAuthorGender(){

        return this.author.getGender();
    }

    public String toString(){

        return "'" + this.name + "' by " + this.author.toString();
    }


}