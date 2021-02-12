package Multi_dimensional_array;

//Given the number n, not exceeding 10, and a matrix of size n × n.
//        Check whether this matrix is symmetric in relation to the main diagonal.
//        Output the word “YES”, if it is symmetric and the word “NO” otherwise.
//        Sample Input:
//        3
//        0 1 2
//        1 2 3
//        2 3 4
//        Sample Output:
//        YES

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int[][] trans = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[j][i] = matrix[i][j];
            }
        }

        boolean isSymetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != trans[i][j]) {
                    isSymetric = false;
                    break;
                }
            }
        }
        if (isSymetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
