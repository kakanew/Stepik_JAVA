package While_and_do_while_loops;

//Given an integer N, print all of the squares of natural numbers that do not exceed N, in ascending order.
//        Note: the squares should not exceed N.
//        Sample Input:
//        50
//        Sample Output:
//        1
//        4
//        9
//        16
//        25
//        36
//        49

import java.util.Scanner;

public class Squares_of_natural_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;

        while (Math.pow(number, 2) <= n) {
            System.out.println((int) Math.pow(number, 2));
            number++;
        }
    }
}
