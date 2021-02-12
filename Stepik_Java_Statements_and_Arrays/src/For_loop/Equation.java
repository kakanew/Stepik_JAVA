package For_loop;

//The roots of equation
//        Given the numbers a, b, c, da,b,c,d.
//        Output in ascending order all the integers between 0 and 1000,
//        which are the roots of the equation ax^3 + bx^2 + cx + d=0ax3 + bx2 + cx + d = 0.
//        If the specified interval does not contain the roots of the equation, do not output anything.
//        Sample Input:
//        -1
//        1
//        -1
//        1
//        Sample Output:
//        1

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        for (int x = 1; x <= 1000; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}
