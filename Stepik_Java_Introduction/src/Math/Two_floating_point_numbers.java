package Math;

//You have been given two floating-point numbers: a and b.
//        Calculate and output the value of the expression a^bab.
//        Note: Use double variables for a and b.
//        Input data format: Two floating-point numbers in one line.
//        Output data format: The result of the expression.
//        Sample Input 1:
//        2 3
//        Sample Output 1:
//        8.0
//        Sample Input 2:
//        2 1.02
//        Sample Output 2:
//        2.027918959580058

import java.util.Scanner;

public class Two_floating_point_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = Math.pow(num1, num2);

        System.out.println(num3);
    }
}
