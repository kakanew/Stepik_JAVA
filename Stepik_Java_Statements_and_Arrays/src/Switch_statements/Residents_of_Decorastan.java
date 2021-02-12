package Switch_statements;

//Residents of Decorastan often experiment with the arrangement of their rooms,
//        which can be triangular, rectangular, or round.
//        To help Decorastanians organize their floor space more efficiently,
//        write a program that uses the room shape and the relevant dimensions
//        as input and outputs the area of the room.
//        Use the value of 3.14 instead of the number π.
//        Hint: Consider using the Math library.
//        Input format used in Decorastan:
//        triangle
//        a
//        b
//        c
//        where a, b, and c are lengths of the sides of the triangle.
//        rectangle
//        a
//        b
//        where a and b are lengths of the sides of the rectangle.
//        circle
//        r
//        where r is the radius of the circle.
//        Note: the input values (a, b, c, r) are doubles, and your output should be too.
//        Sample Input:
//        rectangle
//        4
//        10
//        Sample Output:
//        40.0

import java.util.Scanner;

public class Residents_of_Decorastan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        double a, b, c, r;
        switch (shape) {
            case "triangle":
                // Heron's formula
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + shape);
        }
    }
}
