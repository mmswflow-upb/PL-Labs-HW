import java.util.Vector;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixOperations_V1 {
    public static void main(String[] args) {

        Vector<Vector<Double>> m1;
        Vector<Vector<Double>> m2;
        Vector<Vector<Double>> m3 = new Vector<Vector<Double>>();

        int maxDigits = 3;

        System.out.println(
                "Insert the type of operation: \n[x], [+], [-], [DiagSum], [Scale] , [IncMatrix], [SpiralMatrix], [OddIncMatrix], [MaxValues]:");
        String operation = new Scanner(System.in).nextLine().toLowerCase();

        /*
         * We turn the input into lower case so we don't have to check for every
         * possible combination of
         * big and small characters like "diagSum" or "SCALe" etc..
         */

        int size_m;// Number of rows of a matrix
        int size_n;// number of columns of a matrix

        switch (operation) {// Checking what type of operation does the user request

            case "+":// Addition of two matrices

                Integer[] order_sum = getMatrixOrder("");
                // we call this method to get the array with num of rows and columns
                size_m = order_sum[0];
                size_n = order_sum[1];

                m1 = getMatrices("A", size_m, size_n);
                m2 = getMatrices("B", size_m, size_n);
                // Both matrices will have the same size to be able to make the addition

                for (int i = 0; i < size_m; i++) {

                    /*
                     * we use a for loop to go through every row and for every row we go through
                     * every column in it and
                     * make the addition between the corresponding elements from both matrices (aij
                     * + bij)
                     * e
                     * To be able to do all that we need to create a Vector containing [size_m]
                     * Vectors which will represent
                     * the rows and the row vectors will contain [size_n] elements of the type
                     * (Double) which will
                     * have different indexes starting from 0 and their indexes in the row vectors
                     * will represent their
                     * respective columns.
                     */

                    Vector<Double> line = new Vector<Double>();
                    m3.add(line);

                    for (int v = 0; v < size_n; v++) {

                        m3.get(i).add(m1.get(i).get(v) + m2.get(i).get(v));
                    }
                }
                System.out.println("The resulting matrix C: ");
                maxDigits = findMostDigits(m3);
                printMatrices(m3, size_m, size_n, maxDigits);

                break;

            case "-":
                /*
                 * Subtraction of matrices,the process here is the same as the addition one,
                 * the only difference being that we subtract the elements from one another.
                 */
                Integer[] order_sub = getMatrixOrder("");
                size_m = order_sub[0];
                size_n = order_sub[1];

                m1 = getMatrices("A", size_m, size_n);
                m2 = getMatrices("B", size_m, size_n);

                for (int i = 0; i < size_m; i++) {

                    m3.add(new Vector<Double>());

                    for (int v = 0; v < size_n; v++) {

                        m3.get(i).add(m1.get(i).get(v) - m2.get(i).get(v));
                    }
                }
                System.out.println("The resulting matrix C: ");
                maxDigits = findMostDigits(m3);
                printMatrices(m3, size_m, size_n, maxDigits);
                break;

            case "diagsum":// Getting the sum of the elements found on the main diagonal or above it or
                           // below it.

                System.out.println("Insert the order of the square matrix: [N] ");
                int size = Integer.parseInt(new Scanner(System.in).nextLine());

                m1 = getMatrices("M", size, size);

                System.out.println("Choose between: [OnlyDiag, UnderDiag, AboveDiag]: ");
                String choice = new Scanner(System.in).nextLine().toLowerCase();

                Double diagSum = 0.0;

                if (choice.equals("onlydiag")) {

                    /*
                     * we first create a vector containing [size_m] vectors just like we did in the
                     * addition and subtraction operations
                     * the difference here is that we create a variable called diagSum in which we
                     * will store the sum of all elements found on the
                     * main diagonal.
                     * 
                     * To do that we will use a double for loop in which we loop through every row
                     * and for every row we go through every column
                     * to verify which element has it's row index equal to the column index in order
                     * to add it to the diagSum,until we get to the final
                     * element with index mn.
                     */

                    /*
                     * as for getting the sum of the elements above the diagonal we check if the
                     * number of their respective rows
                     * minus the number of their respective columns is smaller than 0 and we add
                     * them to the diagSum variable,all this
                     * if the choice was to get the upper part.
                     * 
                     * else if the difference is positive (i-v)(row - column) then we are under the
                     * main diagonal and we also add it to the
                     * diagsum,of course if the user inputted that choice.
                     * 
                     */

                    for (int i = 0; i < size; i++) {

                        for (int v = 0; v < size; v++) {

                            if (v == i) {

                                diagSum = diagSum + m1.get(i).get(v);
                            }
                        }
                    }
                    System.out.println("The Diagonal Sum of Your Matrix is: " + diagSum);

                } else if (choice.equals("underdiag")) {

                    for (int i = 0; i < size; i++) {

                        for (int v = 0; v < size; v++) {

                            if (v == i) {// main diagonal

                                diagSum = diagSum + m1.get(i).get(i);

                            } else if ((i - v) > 0) {// the elements under the main diagonal

                                diagSum = diagSum + m1.get(i).get(v);
                            }
                        }
                    }

                    System.out.println("The sum under the main diagonal is: " + diagSum);

                } else if (choice.equals("abovediag")) {

                    for (int i = 0; i < size; i++) {

                        for (int v = 0; v < size; v++) {

                            if (v == i) {// main diagonal

                                diagSum = diagSum + m1.get(i).get(i);

                            } else if ((i - v) < 0) {// the elements above the main diagonal

                                diagSum = diagSum + m1.get(i).get(v);
                            }
                        }
                    }

                    System.out.println("The sum above the main diagonal is: " + diagSum);

                } else {

                    System.out.println("You did not choose any of the available options.");
                }

                break;

            case "spiralmatrix":// The matrix whose elements increment in a spiral.

                /*
                 * we will use 4 indexes to find 4 columns and 4 rows in each loop
                 * 
                 * 
                 * 
                 */
                Integer[] order_spiral = getMatrixOrder("A");
                size_m = order_spiral[0];
                size_n = order_spiral[1];

                int m_2 = size_m, n_2 = size_n;

                Double val = 0.0;

                int k = 0, l = 0;// k is for first row, l is for first column
                // size_m is for last row
                // size_n is for last column

                m1 = new Vector<Vector<Double>>();

                for (int i = 0; i < size_m; i++) {// First we create the matrix.

                    m1.add(new Vector<Double>());
                    for (int v = 0; v < size_n; v++) {

                        m1.get(i).add(0.0);
                    }
                }

                while (k < m_2 - 1 && l < n_2 - 1) {

                    // first remaining row:
                    for (int i = l; i < size_n; ++i) {

                        m1.get(l).set(i, ++val);
                    }
                    k++;

                    for (int i = k; i < size_m; ++i) {// last remaining column

                        m1.get(i).set(size_n - 1, ++val);
                    }
                    size_n--;

                    if (k < size_m) {
                        for (int i = size_n - 1; i >= l; --i) {// last remaining row

                            m1.get(size_m - 1).set(i, ++val);
                        }
                        size_m--;
                    }

                    if (l < size_n) {

                        for (int i = size_m - 1; i >= k; --i) {// first remaining column

                            m1.get(i).set(l, ++val);
                        }
                        l++;
                    }
                }

                maxDigits = findMostDigits(m1);

                System.out.println("Your spiral matrix A: ");
                printMatrices(m1, m1.size(), m1.get(0).size(), maxDigits);

                break;

            case "oddincmatrix":

                /*
                 * The matrix whose elements increment on the odd rows from left to right and on
                 * the even rows from right to left.
                 * 
                 * We first ask the user for the order of the matrix,then we use a while loop to
                 * go through every row of the matrix
                 * and for that we have used the condition that ["nw_elm" < size_m*size_n] by
                 * which we mean that we're looping until the
                 * last element in the matrix which is equal to [number of columns x number of
                 * rows]
                 */
                Integer[] order_oddInc = getMatrixOrder("A");
                size_m = order_oddInc[0];
                size_n = order_oddInc[1];

                Double nw_elm = 1.0;

                int indexRow = 0;

                while (nw_elm < size_m * size_n) {

                    m3.add(new Vector<Double>());

                    for (int v = 0; v < size_n; v++) {

                        m3.get(indexRow).add(0.0);
                    }

                    if (indexRow % 2 == 0) {

                        for (int i = 0; i < size_n; i++) {

                            m3.get(indexRow).set(i, nw_elm++);
                        }

                    } else {

                        for (int i = size_n - 1; i >= 0; i--) {
                            m3.get(indexRow).set(i, nw_elm++);
                        }
                    }
                    indexRow++;
                }

                System.out.println("The odd increasing matrix: ");
                maxDigits = findMostDigits(m3);
                printMatrices(m3, size_m, size_n, maxDigits);

                break;

            case "maxvalues":// finding the maximum values on every row of an inserted matrix and the maximum
                             // value from the whole matrix

                /*
                 * We get the inputted matrix from the user,then we loop through every row and
                 * use the method "findMaxValue" with
                 * the parameters given as the vector representing the rows,so we get the
                 * maximum
                 * 
                 */

                Integer[] order_maxVal = getMatrixOrder("A");
                size_m = order_maxVal[0];
                size_n = order_maxVal[1];

                m1 = getMatrices("A", size_m, size_n);

                Vector<Double> maxValues = new Vector<Double>();

                for (int i = 0; i < size_m; i++) {

                    maxValues.add(findMaxValue(m1.get(i)));
                }

                maxDigits = findMostDigits(m1);
                printMatrices(m1, size_m, size_n, maxDigits);

                for (int v = 0; v < size_m; v++) {

                    System.out.println("The maximum value on row " + (v + 1) + " is :" + maxValues.get(v));
                }

                System.out.println("The Maximum value in the whole matrix is: " + findMaxValue(maxValues));

                break;

            case "incmatrix":

                /*
                 * This is for displaying any square matrix which has incrementing elements on
                 * rows or columns (based on user choice)
                 * 
                 * A.Columns: to achieve such a result we first check for the first row in which
                 * we increment all the elements with the
                 * formula: e1v = (v + 1.0) [v being the number of the column].After adding the
                 * elements in the first row,
                 * we check for the other rows but:
                 * 
                 * 1.If it's the element in the first column,it's going to be incremented from
                 * the last element in the previous row,
                 * with the index: [i-1][size_n] -> size_n is the max number of columns and "i"
                 * is the row
                 * 2.If it's not in the first row nor column then it's going to be incremented
                 * from the previous element on the same
                 * row [v-1] [v is column number]
                 * 
                 * B.Rows: We always check if we're in the first column so that we increment the
                 * elements in it with the formula:
                 * ei1 = (i+1.0) [e is the element and i is the row]
                 * 
                 * 
                 */

                System.out.println("Specify how do you want the elements to increase? [Columns/Rows]: ");
                Scanner inp = new Scanner(System.in);
                String ob = inp.nextLine().toLowerCase();

                Integer[] order_inc = getMatrixOrder("A");
                // we call this method to get the array with num of rows and columns
                size_m = order_inc[0];
                size_n = order_inc[1];

                System.out.println("We are ordering by " + ob);
                System.out.println("The order of the matrix is: " + size_m + "x" + size_n);

                Double incVal = 1.0;

                for (int i = 0; i < size_m; i++) {

                    m3.add(new Vector<>());
                    for (int v = 0; v < size_n; v++) {

                        m3.get(i).add(0.0);
                    }
                }

                if (ob.equals("columns")) {

                    for (int i = 0; i < size_n; i++) {

                        for (int v = 0; v < size_m; v++) {

                            m3.get(v).set(i, incVal++);
                        }
                    }

                } else if (ob.equals("rows")) {

                    for (int i = 0; i < size_m; i++) {

                        for (int v = 0; v < size_n; v++) {

                            m3.get(i).set(v, incVal++);
                        }
                    }
                }
                System.out.println("The " + ob + " increasing matrix:");
                maxDigits = findMostDigits(m3);
                printMatrices(m3, size_m, size_n, maxDigits);

                break;

            case "x":// Product of two Matrices

                /*
                 * We first get the matrices from the user and determine if the operation can be
                 * done or not
                 * if not,then we print out the issue.
                 * 
                 * After getting the matrices we determine the order of the resulting matrix
                 * with the variables :
                 * size_m_3 being the number of rows taken from matrix A and size_n_3 being the
                 * number of columns taken from matrix B.
                 * 
                 * We loop through every row of the new matrix and for every row we loop through
                 * every column in it and create
                 * a new double variable called product_sum which will store the sum of products
                 * of the elements from matrix A and B
                 * 
                 * Then for every element from C that we want to calculate we loop for the
                 * number of columns of A and rows of B
                 * and add to the product_sum variable the product of the element of matrix A in
                 * the same row as the element in matrix C and column (c)
                 * with the element of the matrix B in the same column as element in matrix C
                 * but in the same row as the column of the element of A
                 * (so just the row c)
                 * 
                 * [(c) is an index that starts at 0 and ends at the number of columns of matrix
                 * A and rows of matrix B,and it resets for every new element
                 * of the matrix C; i.e it's always equal to the number of columns in B and
                 * number of rows in A]
                 * 
                 * We repeat this process for every new element in matrix C.
                 */

                Integer[] order_mult1 = getMatrixOrder("A");
                size_m = order_mult1[0];
                size_n = order_mult1[1];

                m1 = getMatrices("A", size_m, size_n);

                Integer[] order_mult2 = getMatrixOrder("B");
                int size_m_2 = order_mult2[0];
                int size_n_2 = order_mult2[1];

                m2 = getMatrices("B", size_m_2, size_n_2);

                if (size_n == size_m_2) {

                    int size_m_3 = size_m;
                    int size_n_3 = size_n_2;

                    for (int i = 0; i < size_m_3; i++) {

                        m3.add(new Vector<Double>());

                        for (int v = 0; v < size_n_3; v++) {

                            Double product_sum = 0.0;

                            for (int c = 0; c < size_n; c++) {

                                product_sum = product_sum + (m1.get(i).get(c) * m2.get(c).get(v));
                            }
                            m3.get(i).add(product_sum);
                        }
                    }

                    System.out.println("The resulting matrix C:");
                    maxDigits = findMostDigits(m3);
                    printMatrices(m3, size_m_3, size_n_3, maxDigits);

                } else {

                    System.out.println(
                            "Cannot calculate the product.The number of columns in A must be equal to the number of rows in B");
                }
                break;

            case "scale":// Multiplying a matrix with a scalar (floats)

                /*
                 * We first ask the user to input the number we're going to scale the matrix
                 * with.
                 * After that we get the big Vector representing the matrix and loop through
                 * each of its smaller Vectors that
                 * represent the rows.For every row we loop through each column to multiply the
                 * elements of every column by the scalar.
                 */

                System.out.println("Insert the scalar we're multiplying the matrix with: ");

                String scalar_inp = new Scanner(System.in).nextLine();
                Double scalar = Double.parseDouble(scalar_inp);

                Integer[] order_scale = getMatrixOrder("A");
                size_m = order_scale[0];
                size_n = order_scale[1];

                m1 = getMatrices("A", size_m, size_n);

                for (int i = 0; i < size_m; i++) {

                    m3.add(new Vector<Double>());

                    for (int v = 0; v < size_n; v++) {

                        m3.get(i).add((m1.get(i).get(v)) * scalar);
                    }
                }
                System.out.println("The resulting scaled matrix C:");
                maxDigits = findMostDigits(m3);
                printMatrices(m3, size_m, size_n, maxDigits);

                break;

            default:// The inserted operation is not predefined by this program.

                System.out.println("You did not choose an available operation.");
        }
    }

    public static Double findMaxValue(Vector<Double> row) {

        Double lastMax = row.get(0);

        for (int index = 0; index < row.size() - 1; index++) {

            Double newMax = Math.max(row.get(index), row.get(index + 1));

            if (newMax > lastMax) {

                lastMax = newMax;
            }
        }
        return lastMax;
    }

    public static Integer[] getMatrixOrder(String m_Name) {// A method to read the matrices orders as MxN

        /*
         * We ask the user for the matrix order to be typed as M[Rows]xN[Columns]
         * then we find the index of "x",after that we set the value of the rows to the
         * substring of the inputted matrix order
         * starting from 0 to the index of "x",as for the number of columns we set it to
         * the value found in the substring
         * starting from the index of "x" + 1 (so we don't take "x") up to the length of
         * the initial input.
         * 
         */

        Integer[] order = { 0, 0 };

        System.out.println("Insert the order of the matrix " + m_Name + " as MxN");

        String order_inp = (new Scanner(System.in)).nextLine().toLowerCase();

        int indexOfX = order_inp.indexOf("x");

        order[0] = Integer.parseInt(order_inp.substring(0, indexOfX));
        order[1] = Integer.parseInt(order_inp.substring(indexOfX + 1, order_inp.length()));

        return order;
    }

    public static void printMatrices(Vector<Vector<Double>> matrix, int size_m, int size_n, int maxDigits) {// A method
                                                                                                            // to print
                                                                                                            // any given
                                                                                                            // matrix.

        /*
         * The idea behind this method is that we're going to get the big Vector which
         * contains the other row Vectors
         * and loop through every row vector and for every row vector we create a string
         * variable called "row" then we loop through its columns
         * to add every element of that row in the variable "row",if it's the first
         * element then we're also adding the char '|' (for aesthetics)
         * and conversely if it's the last one we also add '|'.
         * After we're done looping through the columns of the current row we print the
         * whole row.This process repeats its self until we get to the
         * row number [size_m].
         * 
         * In addition to that,for every element we check wether it's as long as the
         * longest element or not,if it's not we're going to add
         * spaces before it so the printed matrix looks symmetrical.To do that we
         * calculate the difference between the length of the
         * current element and the longest element,we add spaces to compensate for that
         * difference if it exists.
         */

        for (int i = 0; i < size_m; i++) {

            String row = "|";

            for (int v = 0; v < size_n; v++) {

                int diffInLength = Math.abs((Double.toString(matrix.get(i).get(v)).length() - maxDigits));

                String proc_elem = Double.toString(matrix.get(i).get(v));

                if (diffInLength > 0) {// This element is shorter than the longest element so we're adding
                                       // (diffInLength) spaces before it.

                    for (int z = 0; z < diffInLength + 1; z++) {

                        row = row + ' ';
                    }
                } else if (diffInLength == 0) {

                    // This element is as long as the longest one in the matrix so we're adding only
                    // one space to separate elements of each other

                    proc_elem = ' ' + proc_elem;
                }

                if (v == 0 && size_n != 1) {// first element but the number of columns is not 1

                    row = row + proc_elem;

                } else if (v + 1 == size_n && size_n != 1) {// last element and number of columns is not 1

                    row = row + proc_elem + "|";

                } else if (size_n == 1) {// number of columns is 1

                    row = row + proc_elem + "|";

                } else {// elements in-between (not first nor last)

                    row = row + proc_elem;
                }
            }
            System.out.println(row);
        }
    }

    public static int findMostDigits(Vector<Vector<Double>> matrix) {

        /*
         * Find out what is the number of digits of the [longest] element in the matrix.
         * return it in order to be able to print matrices in a more presentable way.
         */
        int mostDigits = 3;

        for (int i = 0; i < matrix.size(); i++) {

            for (int v = 0; v < matrix.get(i).size(); v++) {

                int elemLen = Double.toString(matrix.get(i).get(v)).length();

                if (elemLen > mostDigits) {

                    mostDigits = elemLen;
                }
            }
        }
        return mostDigits;
    }

    public static Vector<Vector<Double>> getMatrices(String matrixName, int size_m, int size_n) {

        /*
         * This method gets as input the name of the matrix, number of rows and the
         * number of columns:
         * 
         * Then it asks the user to input the element in the mth row as
         * [e11,e12,e13..etc] for every row
         * and to get every element from the input,we loop through the resulting string
         * (row.length) times
         * so we get to verify each character and to find the numbers in it we first get
         * the index of the first
         * comma if it exists and we deduce that the number is between index 0 and index
         * of the comma
         * then we subtract that piece of string out of the saved string input and we
         * repeat this process.
         * 
         * Else if there is no comma in the first place then the element will be found
         * from index 0 all the way to
         * the last character in the string and we break the looping through that
         * specific row.
         * 
         * Of course once we have found an element we add it in the "row vector" and we
         * repeat this until we get to
         * the "size_m"th row.
         */

        Vector<Vector<Double>> matrix = new Vector<Vector<Double>>();

        for (int i = 0; i < size_m; i++) {

            matrix.add(new Vector<Double>());

            System.out.println("Please insert the elements of row " + (i + 1) + " in the matrix " + matrixName + " :");
            String row = new Scanner(System.in).nextLine();

            int len = row.length();

            for (int v = 0; v < len; v++) {

                int indexOfCom = row.indexOf(",");

                if (indexOfCom == -1) {

                    row = row.substring(0, row.length());
                    matrix.get(i).add(Double.parseDouble(row));

                    break;
                }
                matrix.get(i).add(Double.parseDouble(row.substring(0, indexOfCom)));
                row = row.substring((indexOfCom + 1), row.length());
            }
        }
        return matrix;
    }
}