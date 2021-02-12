package Floating_point;

//Write a program which reads a double value x and evaluates the result of x^3 + x^2 + x + 1x
//        3 + x 2 + x + 1
//        Output data format: The double result of the expression.
//        Sample Input:
//        22.5
//        Sample Output:
//        11920.375

import java.util.Scanner;

public class Double_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double xR = x * x * x + x * x + x + 1;

        System.out.println(xR);
    }
}
