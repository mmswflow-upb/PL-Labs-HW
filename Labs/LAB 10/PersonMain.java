public class PersonMain{
    
    public static void main(String[] args){

        PersonArray myArray = new PersonArray(5);

        myArray.insert("Sakka", "Mario", 18);
        myArray.insert("Sakka", "Luai", 19);
        myArray.insert("Sakka", "Diana", 17);
        myArray.insert("Sakka", "Iasmina", 16);
        myArray.insert("test", "MarioInViitor", 30);

        myArray.displayArray();

        myArray.delete("test");
        myArray.displayArray();

        Person res = myArray.find("Marian");

        if (res != null){

            System.out.println("Person Found: ");
            res.displayPerson();

        }else{

            System.out.println("Marian not found in array.");
        }
    }
    

}