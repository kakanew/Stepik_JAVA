package Floating_point;

//You have been given a positive real number X. Output the first digit after the decimal point.
//        Sample Input:
//        1.79
//        Sample Output:
//        7

import java.util.Scanner;

public class Decimal_point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();

        double num2 = num1 * 100;
        int num3 = (int) num2;
        int digi = (num3 / 10) % 10;

        System.out.println(digi);
    }
}
