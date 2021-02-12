package Conditional_statements;

//A chocolate bar has a rectangular shape, divided into NxM segments.
//        You can break down this chocolate bar into two parts by a single straight line (only once).
//        Determine if you can break off exactly K segments of chocolate. (Each segment is 1x1.)
//        Input data format
//        User inputs three integers: N, M, K.
//        Output data format
//        The program must output one of the two words: YES or NO.
//        Sample Input:
//        4
//        2
//        6
//        Sample Output:
//        YES

import java.util.Scanner;

public class Chocolate_bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if ((k % n == 0 || k % m == 0) && m * n > k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
