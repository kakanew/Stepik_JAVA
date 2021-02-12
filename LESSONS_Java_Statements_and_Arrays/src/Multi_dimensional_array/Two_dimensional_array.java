package Multi_dimensional_array;

//Given a two-dimensional array (matrix) and the two numbers: i and j.
//        Swap the columns with indices i and j within the matrix.
//        Input contains matrix dimensions n and m, not exceeding 100,
//        then the elements of the matrix, then the indices i and j.
//        Sample Input:
//        3 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//        0 1
//        Sample Output:
//        12 11 13 14
//        22 21 23 24
//        32 31 33 34

import java.util.Scanner;

public class Two_dimensional_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] field = new int[rows][columns];
        int[] replace = new int[rows];

        for (int iRow = 0; iRow < field.length; iRow++) {
            for (int iColumn = 0; iColumn < field[iRow].length; iColumn++) {
                field[iRow][iColumn] = sc.nextInt();
            }
        }

        int exchange1 = sc.nextInt();
        int exchange2 = sc.nextInt();

        for (int iRow = 0; iRow < field.length; iRow++) {
            replace[iRow] = field[iRow][exchange1];
        }

        for (int iRow = 0; iRow < field.length; iRow++) {
            field[iRow][exchange1] = field[iRow][exchange2];
        }

        for (int iRow = 0; iRow < field.length; iRow++) {
            field[iRow][exchange2] = replace[iRow];
        }
        for (int iRow = 0; iRow < field.length; iRow++) {
            for (int iColumn = 0; iColumn < field[iRow].length; iColumn++) {
                System.out.print(field[iRow][iColumn] + " ");
            }
            System.out.println();
        }
    }
}
