package Math;

//You have been given the real numbers a, b, c, where a ≠ 0.
//        Solve the quadratic equation ax^2 + bx + c = 0ax2+bx+c=0 and output all of its roots.
//        It is guaranteed that the equation always has two roots.
//        Output the results roots in ascending order. Do not round or format them, the testing system does it automatically.
//        Sample Input 1:
//        1
//        -1
//        -2
//        Sample Output 1:
//        -1 2
//        Sample Input 2:
//        1
//        -7.5
//        3
//        Sample Output 2:
//        0.423966 7.07603

import java.util.Scanner;

public class Real_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println(Math.min(x1, x2));
        System.out.println(Math.max(x1, x2));
    }
}
