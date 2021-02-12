package Math;

//You have been given two 2D vectors. Find the angle (degrees) between them.
//        If you don't know how to find the angle, see here:
//        Input data format: The first line contains two components of the first vector,
//        the second line contains two components of the second vector. Components in a line are separated by a space.
//        Output data format: One double value - an angle between two vectors. The result can have an error less than 1e-8.
//        Sample Input:
//        1 3
//        4 2
//        Sample Output:
//        45

import java.util.Scanner;

public class Two_2D_vectors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();

        double val = a * c + b * d;
        double val1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double val2 = Math.sqrt(Math.pow(c, 2) + Math.pow(d, 2));
        double ansRad = val / (val1 * val2);
        double ans = Math.acos(ansRad);
        System.out.println((int) Math.toDegrees(ans));
    }
}
