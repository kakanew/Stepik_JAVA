package Floating_point;

//You have been given a positive real number X. Output its fractional part.
//        Sample Input:
//        17.9
//        Sample Output:
//        0.9

import java.util.Scanner;

public class Fractional_part {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();

        int num2 = (int) num1;
        double num3 = num1 - num2;

        System.out.println(num3);
    }
}
