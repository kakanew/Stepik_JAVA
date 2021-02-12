package Multi_dimensional_array;

//The cinema has n rows, each consisting of m seats (n and m do not exceed 20).
//        The two-dimensional matrix stores the information on the sold tickets,
//        number 1 means that the ticket for this place is already sold,
//        the number 0 means that the place is available.
//        You want to buy k tickets to the neighbouring seats in the same row.
//        Find whether it can be done.
//        Input data format
//        On the input, the program gets the numbers n and m. Next go n lines,
//        each containing m numbers (0 or 1), separated by spaces. Next goes the number k.
//        Output data format
//        The program should output the row number in which there are k consecutive available seats.
//        If there are several such rows, output the number of the smallest such row.
//        If there is no such row, output the number 0.
//        Sample Input:
//        3 4
//        0 1 0 1
//        1 0 0 1
//        1 1 1 1
//        2
//        Sample Output:
//        2

import java.util.Scanner;

public class The_cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int t = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    boolean found = true;
                    for (int k = 0; k < t; k++) {
                        if (j + k >= m || matrix[i][j + k] != 0) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println(i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }
}
