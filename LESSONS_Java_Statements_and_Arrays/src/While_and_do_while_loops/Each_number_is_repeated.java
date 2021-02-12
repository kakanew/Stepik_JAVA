package While_and_do_while_loops;

//Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...,
//        in which each number is repeated as many times as its value.
//        The input is a positive integer n – the number of the elements of the sequence
//        that the program should print. The output should be written in a single line,
//        with all numbers separated by single spaces.
//        Sample Input:
//        7
//        Sample Output:
//        1 2 2 3 3 3 4

import java.util.Scanner;

public class Each_number_is_repeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int count = 1;
        int k = 1;
        int gCount = 0;

        while (count <= m) {
            while (k <= count & gCount < m) {
                System.out.print(count + " ");
                k++;
                gCount++;
            }
            k = 1;
            count++;
        }
    }
}
