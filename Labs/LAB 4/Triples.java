import javax.lang.model.util.ElementScanner14;

public class Triples{

    public static void main(String[] args){
        
        int[] list = {1,2,39,42,50,-6,7,8,-30,100};

        int sum = 4;

        sortList(list);
        
        System.out.println("Triplets for the sum: " + sum);
        findTriplets(list, sum);

    }
    public static void findTriplets(int[] list, int sum){

       int p,q;
    
       for (int i = 0; i < list.length-1; i++){

        p = i +1;
        q = list.length -1;
            
        while (p < q){

            if (list[i] + list[p] + list[q] == sum){

                System.out.println(list[i] + " "+ list[p] + " " + list[q] + "\n");
                p++;
                q--;
            }else if (list[i] + list[p] + list[q] < sum){

                p++;

            }else{

                q--;
            }
        }
       }
    }

    public static void printList(int[] list){

        String row = "";

        for (int c = 0; c < list.length; c++){

            row += list[c] + " ";

        }

        System.out.println(row);
    }

    public static int[] sortList(int[] list){

        int temp = 0;

        for (int i = 0; i < list.length; i++){

            for (int v = i; v < list.length; v++){

                if (list[i] > list[v]){

                    temp = list[v];
                    list[v] = list[i];
                    list[i] = temp;
                }
            }
        }
    return list;
    }
    
}