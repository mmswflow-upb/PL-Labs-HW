public class Product{

    private String name;
    private Double price;


    public Product(String name, Double price){

        this.name = name;
        this.price = price;
    }

    public Double getPriceInRon(){

        return this.price;
    }

    public void setPriceInRon(Double newPrice){

         price = newPrice;
    }

    public void setPrice(Double newPrice2){

       price = newPrice2;
    }

    public Double getPrice(){

        return this.price;
    }

    public void displayProduct(){

              System.out.println("Product name: " + this.name + " Price: " + this.price);
    }
}