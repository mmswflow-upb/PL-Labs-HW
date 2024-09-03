public class Lab4_Ex1{

    public static void main(String[] args){

        int[] a = {2,4,7,8,10,11};
        int[] b = {3,5,6,9,12,13,14,15};

        int cLen = a.length + b.length;
        int count = 0,last_B = b[0],last_A = a[0];

        int[] c = new int[cLen];

        int a_sorted = 0, b_sorted = 0;

            while (a_sorted <= a.length  && b_sorted <= b.length){

                        if (last_A < last_B){

                           

                            c[count] = last_A;
                            count++;
                            a_sorted++;

                            if (a_sorted == a.length){

                                break;
                            }

                            last_A = a[a_sorted];
                            

                        }else if (last_A > last_B){


                            c[count] = last_B;
                            count++;
                            b_sorted++;



                            if (b_sorted == b.length){

                                break;
                            }
                            last_B = b[b_sorted];
                            
                            
                        }else{

                            c[count] = last_B;
                            c[count+1] = last_A;

                            count =+ 2;

                            a_sorted++;
                            b_sorted++;

                            if (a_sorted == a.length || b_sorted == b.length){

                                break;
                            }

                            last_A = a[a_sorted];
                            last_B = b[b_sorted];
                        }
            }


            while (b_sorted < b.length){

                

                c[count] = b[b_sorted];
                count++;
                b_sorted++;
            }

            while (a_sorted < a.length){

                c[count] = a[a_sorted];
                count++;
                a_sorted++;
            }

            for (int i = 0; i < cLen; i++){

                System.out.print( " " + c[i]);
            }
        }
}