public class Person{

    private int age;
    private String lastName;
    private String firstName;

    public Person(String first, String last, int a){

        this.age = a;
        this.lastName = last;
        this.firstName = first;
    }

    public String getLast(){

        return this.lastName;
    }

    public void displayPerson(){

        System.out.println(this.lastName + " " + this.firstName + " , " + String.valueOf(this.age));
    }

}