public class PersonArray{
    
    private int numOfPeople;
    private Person[] people;

    public PersonArray(int maxSize){

        this.people = new Person[maxSize];
        this.numOfPeople = 0;
    }

    public void insert(String last, String first, int a){

        if (this.numOfPeople < this.people.length){

            numOfPeople++;

            people[numOfPeople-1]  = new Person(first, last, a);
        }
    }

    public Person find(String searchName){

        for (int i = 0; i < numOfPeople; i++){

            if (this.people[i] != null){

                if (this.people[i].getLast().equals(searchName)){

                    return this.people[i];
                }
            }
           
        }

        return null;
    }

    public Boolean delete(String searchName){

        Person res = find(searchName);

        int indx = 0;

        if (res != null){

            for (int i = 0; i < numOfPeople; i++){

                if (this.people[i] == res){
                    
                    this.people[i] = null;
                    indx = i;
                    break;
                }
            }

            for (int i = indx+1; i < this.people.length; i++){

                if (this.people[i] != null){

                    this.people[i-1] = this.people[i];
                }
            }
        }
        return false;
    }

    public void displayArray(){

        for (int i = 0; i < numOfPeople; i++){

            if (this.people[i] != null){

                people[i].displayPerson();
            }
        }
    }
}