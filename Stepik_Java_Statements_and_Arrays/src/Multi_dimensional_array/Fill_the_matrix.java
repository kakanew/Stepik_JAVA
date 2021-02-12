package Multi_dimensional_array;

//Fill the matrix
//        Given the number n, not greater than 100.
//        Create the matrix of size n×n and fill it by the following rule.
//        Numbers 0 should be stored on the primary diagonal.
//        The two diagonals, adjacent to the primary one, should contain numbers 1.
//        The next two diagonals - numbers 2, etc.
//        Sample Input:
//        5
//        Sample Output:
//        0 1 2 3 4
//        1 0 1 2 3
//        2 1 0 1 2
//        3 2 1 0 1
//        4 3 2 1 0

import java.util.Scanner;

public class Fill_the_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(Math.abs(i - j) + " ");
            }
            System.out.println();
        }
    }
}
