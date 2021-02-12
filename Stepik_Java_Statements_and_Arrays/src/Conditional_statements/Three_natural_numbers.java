package Conditional_statements;

//Given three natural numbers A, B, and C, determine if there exists a
//        triangle with side lengths equal to these numbers.
//        If such a triangle exists, output YES; otherwise, output NO.
//        Hint: In any triangle, no side can be greater than or equal to the sum of the other two sides.
//        Sample Input:
//        3
//        4
//        5
//        Sample Output:
//        YES

import java.util.Scanner;

public class Three_natural_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean test = a + b > c && a + c > b && b + c > a;

        if (test) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
