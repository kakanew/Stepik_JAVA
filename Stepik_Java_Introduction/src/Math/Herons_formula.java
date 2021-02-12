package Math;

import java.util.Scanner;

public class Herons_formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // three sides of a triangle
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        // Heron's formula
        double p = (a + b + c) / 2.0d;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);
    }
}
