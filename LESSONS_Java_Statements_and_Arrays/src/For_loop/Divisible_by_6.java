package For_loop;

//Given the sequence of natural numbers. Find the sum of numbers, divisible by 6.
//        The input is number of elements in the sequence, and then the elements themselves.
//        In this sequence, there is always a number, divisible by 6.
//        Sample Input:
//        11
//        36
//        36
//        89
//        63
//        78
//        6
//        93
//        12
//        62
//        96
//        63
//        Sample Output:
//        264

import java.util.Scanner;

public class Divisible_by_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int next = 0;

        for (int i = 0; i < number; i++) {
            next = scanner.nextInt();
            if (next % 6 == 0) {
                sum += next;
            }
        }
        System.out.println(sum);
    }
}
