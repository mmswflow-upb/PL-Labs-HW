public class HW10Ex1{

    public static void main(String[] args){
        
        int[] myarr = {-1,1,0,0,0,0,0,7,0,5,0,0,1,9};

        int[] newArr = noDuplicates(myarr);

        System.out.println("The new array containing unique elements: ");
        displayArray(newArr);
    }

    public static void displayArray(int[] arr){

        String text = "";

        for (int i = 0; i < arr.length; i++){

            text += arr[i] + ", ";
        }

        System.out.println(text + "\n");
    }

    public static int[] noDuplicates(int[] a){

        int[] res;
        int numOfDup = 0;
        
    
        for (int i = 0 ; i < a.length; i++){

            for (int z = i+1; z < a.length-numOfDup; z++){

                if (a[i] == a[z]){ 
                    
                    for (int x = z+1; x < a.length; x++){

                        a[x-1] = a[x];
                    }
                    z--;
                    numOfDup++;
                }
            }
        }

        res = new int[a.length-numOfDup];
        int l = 0;

        for (int i = 0; i < a.length-numOfDup; i++){//Adding the new elements into the new smaller array.

            res[l++] = a[i];
        }
        return res;
    }
}