package Conditional_statements;

//Write a program that reads a number and prints YES if it is positive. Otherwise, the program should print NO.
//        Sample Input:
//        7
//        Sample Output:
//        YES

import java.util.Scanner;

public class YES_NO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
