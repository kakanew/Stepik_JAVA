package Multi_dimensional_array;

//Input, separated by spaces: the number of rows of the matrix,
//        the number of columns of the matrix,
//        then go the elements of the two-dimensional matrix itself, row by row.
//        Output: the result of the transposition of the matrix (row by row).
//        Sample Input:
//        2 3 1 2 3 4 5 6
//        Sample Output:
//        1 4 2 5 3 6

import java.util.Scanner;

public class Separated_by_spaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextInt();
            }
        }
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
