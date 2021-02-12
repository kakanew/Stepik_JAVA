package While_and_do_while_loops;

//Given a sequence of natural numbers not exceeding 30000, find its maximum element that is divisible by 4.
//        The input starts with the total number of elements in the sequence,
//        and then lists the elements themselves. At least one number in the sequence
//        is guaranteed to be divisible by 4. The total number of elements does not exceed 1000.
//        The numbers may not be in order. The program should print a single number that
//        is the maximum element of the sequence divisible by 4.
//        Sample Input:
//        10
//        63
//        26
//        39
//        12
//        16
//        36
//        11
//        74
//        62
//        61
//        Sample Output:
//        36

import java.util.Scanner;

public class Divisible_by_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = 0; // "a sequence of natural numbers"

        do {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
            count--;
        } while (count != 0);

        System.out.print(max);
    }
}
