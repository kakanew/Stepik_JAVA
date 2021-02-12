package Multi_dimensional_array;

//Output the matrix of size n \times nn×n, filled by the integers from 11 to n^2n2
//        in a spiral, coming from the top left corner and twisted clockwise,
//        as shown in the example (here n=5n=5).
//        Sample Input:
//        5
//        Sample Output:
//        1 2 3 4 5
//        16 17 18 19 6
//        15 24 25 20 7
//        14 23 22 21 8
//        13 12 11 10 9

import java.util.Scanner;

public class Twisted_clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = size;
        int m = size;
        int val = 1;
        int[][] a = new int[n][m];
        int k = 0;
        int l = 0;
        while (k < m && l < n) {
            for (int i = l; i < n; ++i) {
                a[k][i] = val++;
            }
            k++;

            for (int i = k; i < m; ++i) {
                a[i][n - 1] = val++;
            }
            n--;
            if (k < m) {
                for (int i = n - 1; i >= l; --i) {
                    a[m - 1][i] = val++;
                }
                m--;
            }
            if (l < n) {
                for (int i = m - 1; i >= k; --i) {
                    a[i][l] = val++;
                }
                l++;
            }
        }
        for (int[] anInt : a) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < size; j++) {
                builder.append(anInt[j]).append(" ");
            }
            System.out.println(builder.toString().trim());
        }
    }
}
