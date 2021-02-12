package Conditional_statements;

//Given a four-digit number, determine whether its decimal notation is a palindrome (i.e. its notation is symmetrical; see the samples below). If the number is a palindrome, output 1; otherwise, output any other integer. If the number has fewer than four digits, assume that its decimal notation has leading zero(s) for a total of four digits. For example, treat 330 as 0330.
//        Sample Input 1:
//        2002
//        Sample Output 1:
//        1
//        Sample Input 2:
//        2008
//        Sample Output 2:
//        37

import java.util.Scanner;

public class Four_digit_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;

        if (a == d && b == c) {
            System.out.print("1");
        } else {
            System.out.print("37");
        }
    }
}
