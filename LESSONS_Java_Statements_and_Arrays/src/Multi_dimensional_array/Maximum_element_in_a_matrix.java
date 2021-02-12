package Multi_dimensional_array;

//Find the indexes of the initial appearance of the maximum element in a matrix.
//        Input data format
//        On the input, the program receives the size of matrix n and m,
//        and then n lines having m integer numbers in each. n and m do not exceed 100.
//        Output data format
//        Output two numbers: the row number and the column number,
//        in which the greatest item in the two-dimensional array (matrix) is located.
//        If there are several such elements, output the one, which has the smaller row number;
//and if row numbers are the same - the one having the smaller column number.
//        Sample Input:
//        3 4
//        0 3 2 4
//        2 3 5 5
//        5 1 2 3
//        Sample Output:
//        1 2

import java.util.Scanner;

public class Maximum_element_in_a_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();

            }
        }
        int max = array[0][0];
        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.print(iMax + " ");
        System.out.print(jMax + " ");
    }
}
