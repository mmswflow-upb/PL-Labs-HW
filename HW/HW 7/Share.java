import javax.swing.text.html.StyleSheet;

public class Share{

    private Double value;
    private Company company;

    public Share(){

        this.value = 6000.0;
        this.company = new Company("Tesla");
    }

    public Share(Double val,Company comp){

        this.value = val;
        this.company = comp;
    }

    public Double getValue(){

        return this.value;
    }


}