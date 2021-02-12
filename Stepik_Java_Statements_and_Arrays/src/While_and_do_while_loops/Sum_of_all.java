package While_and_do_while_loops;

//Given a sequence of integers ending with the number 0, find the sum of all its elements.
//        The 0 serves as a terminating element and is not included in the sequence.
//        Sample Input:
//        3
//        6
//        8
//        0
//        Sample Output:
//        17

import java.util.Scanner;

public class Sum_of_all {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int temp = 0;
        while ((temp = scanner.nextInt()) != 0) {
            sum += temp;
        }
        System.out.println(sum);
    }
}
