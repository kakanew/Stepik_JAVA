package Multi_dimensional_array;

//Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise,
//        by recording the result into the new array m×n in size.
//        Input data format
//        Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
//        Output data format
//        Output the resulting array. Separate numbers by a single space in the output.
//        Sample Input:
//        3 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//        Sample Output:
//        31 21 11
//        32 22 12
//        33 23 13
//        34 24 14

import java.util.Scanner;

public class Rotate_it_by_90_degrees_clockwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] array = new int[m][n];
        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                transpose[i][j] = array[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
