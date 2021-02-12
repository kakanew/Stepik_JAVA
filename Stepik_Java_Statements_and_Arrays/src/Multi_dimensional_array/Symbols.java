package Multi_dimensional_array;

//Given an odd number n, not exceeding 15.
//        Create a two-dimensional array (matrix) from n×n elements,
//        by filling it with "." symbols (each element of the matrix is a string containing a single symbol).
//        Then fill the middle row of the matrix, the middle column,
//        and the main and the secondary diagonals with the "*" symbols.
//        As a result, all "*"s in the array must form the star figure.
//        Output this matrix; elements of the array should be space separated.
//        Sample Input:
//        5
//        Sample Output:
//        * . * . *
//        . * * * .
//        * * * * *
//        . * * * .
//        * . * . *

import java.util.Scanner;

public class Symbols {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n / 2 || i == n / 2 || j == i || j == n - (i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
