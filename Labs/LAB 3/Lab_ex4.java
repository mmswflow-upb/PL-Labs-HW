import java.util.Scanner;

public class Lab_ex4{

    

    public static void main(String[] args){

        

        System.out.println("Insert an integer to check if it's in the list.");
        int inp_num = new Scanner(System.in).nextInt();

        Boolean found = false;

        int[] list = {0,45,55,65,76,89,100,534,690,980};

        int len = (list.length);

        while (found == false){

            if (inp_num == list[len/2]){//num is actually the middle one

                System.out.println("We have found the inputted number in the middle of the list");
                break;

            }else if (inp_num > list[len/2]){//num is bigger than the middle one

                for (int i = len-1; i >= (len/2); i--){

                    if (list[i] == inp_num){

                        found = true;
                        System.out.println("We have found the number in the right side of the list.");
                        break;
                    }
                }

            }else{//num is smaller  than the middle one

                for (int i = 0; i < (len/2); i++){

                    if (list[i] == inp_num){

                        found = true;
                        System.out.println("We have found the number in the left side of the list.");
                        break;
                    }
                }  
            }
            if (found == false){

                System.out.println("We haven't found the number in the list");
            }
        }
    }
}