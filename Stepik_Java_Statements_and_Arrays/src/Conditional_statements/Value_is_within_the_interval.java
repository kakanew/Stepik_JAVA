package Conditional_statements;

//Given an integer, output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞).
//        Otherwise, output False (case-sensitive).
//        Please note the different parentheses and brackets used to specify open and semi-open intervals.
//        For more information about this notation, please see  Wikipedia.
//        Sample Input:
//        20
//        Sample Output:
//        True

import java.util.Scanner;

public class Value_is_within_the_interval {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        if (a > -15 & a <= 12 | a > 14 & a < 17 | a >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
