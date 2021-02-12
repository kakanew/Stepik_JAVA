package While_and_do_while_loops;

//Write a program that accepts, as input, a sequence of non-negative integers,
//        each written on a separate line. When the program encounters 0,
//        it should stop and output the total length of the sequence so far (not including the final 0).
//        Do not read any numbers following 0.
//        Sample Input:
//        1
//        7
//        9
//        0
//        5
//        Sample Output:
//        3

import java.util.Scanner;

public class Sequence_of_non_negative_integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.nextInt() != 0) {
            count++;
        }
        System.out.println(count);
    }
}
