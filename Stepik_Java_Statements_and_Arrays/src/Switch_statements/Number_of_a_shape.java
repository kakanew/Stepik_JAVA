package Switch_statements;

//Write a program that reads the number of a shape
//        (1 – square, 2 – circle, 3 – triangle, 4 – rhombus)
//        and prints You have chosen a square (or circle, or triangle,
//        or rhombus, depending on the number).
//        If the number does not correspond to any of the listed shapes,
//        the program should output, There is no such shape!.
//        Note: Please make sure your output exactly matches the required string,
//        including capitals, spaces, and punctuation marks.
//        Sample Input:
//        1
//        Sample Output:
//        You have chosen a square

import java.util.Scanner;

public class Number_of_a_shape {
    public static void main(String[] args) {
        //Accept userInput
        int userInput = new Scanner(System.in).nextInt();

        switch (userInput) {
            case 1: System.out.println("You have chosen a square");
            break;
            case 2: System.out.println("You have chosen a circle");
            break;
            case 3: System.out.println("You have chosen a triangle");
            break;
            case 4: System.out.println("You have chosen a rhombus");
            break;
            default:System.out.println("There is no such shape!");
        }
    }
}
