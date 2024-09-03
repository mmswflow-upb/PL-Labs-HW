public class HW6{

    public static void main(String[] args){


        Student myStudent = new Student("Mohamad-Mario");
        myStudent.addExam(8.5);
        myStudent.addExam(10.);
        myStudent.addExam(7.3);//The total is 25.8 and the mean mark is: 8.6

        System.out.println("The student named " + myStudent.getName() + " has a total of " + myStudent.getTotal() + " points.");
        System.out.println(myStudent.getName()+"'s mean mark is: " + myStudent.getMeanMark() + "\n");

        Product prod1 = new Product("Burete", 2.5);
        Product prod2 = new Product("Pastrav", 6.7);

        prod1.displayProduct();
        prod2.displayProduct();

        prod1.setPrice(prod1.getPrice() + 10.25);
        prod2.setPrice(prod2.getPrice() + 10.25);

        System.out.println("\nProducts after changing their prices: \n");

        prod1.displayProduct();
        prod2.displayProduct();
    }
}