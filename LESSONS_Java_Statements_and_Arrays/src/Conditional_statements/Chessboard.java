package Conditional_statements;

//Given coordinates of two queens on a chessboard, determine if they are attacking each other or not.
//        (A chess queen attacks in three ways: along its rank, in both directions; along its file,
//        in both directions, and diagonally in all four directions.)
//        Input data format
//        User inputs two pairs of integer coordinates: x_1, y_1, x_2, y_2x1, y1, x2, y2, all in the interval [1,8].
//        Output data format
//        Type "YES" (uppercase) if the two queens are attacking each other, or "NO" if they don't.
//        Hint: You may need to use the following method, which calculates the absolute value of a number:
//        Math.abs(n)
//        Sample Input:
//        1 1 3 3
//        Sample Output:
//        YES

import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2) { // Queens are on the same rank.
            System.out.println("YES");
        } else if (y1 == y2) { // Queens are on the same file.
            System.out.println("YES");
        } else if (Math.abs((x1 + y1) - (x2 + y2)) % 2 == 0) { // Queens are on the same diagonal.
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
