package While_and_do_while_loops;

//Given a natural number n, generate a sequence of integers described in the Collatz conjecture:
//        If n is even, divide it in half. If it is odd, multiply it by 3 and add 1.
//        Repeat this operation until reaching 1.
//        For example, if n = 17, the sequence looks as follows:
//        17 52 26 13 40 20 10 5 16 8 4 2 1
//        The conjecture states that such a sequence will eventually reach 1 for any value of n.
//        Output format:
//        Sequence of integers in a single line, separated by single spaces.
//        Sample Input:
//        17
//        Sample Output:
//        17 52 26 13 40 20 10 5 16 8 4 2 1

import java.util.Scanner;

public class Collatz_conjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
        }
    }
}
