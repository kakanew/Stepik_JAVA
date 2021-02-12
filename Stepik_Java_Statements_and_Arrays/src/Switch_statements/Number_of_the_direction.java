package Switch_statements;

//Write a program that reads the number of the direction
//        (1 – up, 2 – down, 3 – left, 4 – right, 0 – stay) and outputs move up
//        (or "move down", or "move left", or "move right", or "stay" depending on the entered number).
//        If the number does not correspond to any of the listed directions, the program should output error!
//        Note: Please make sure your output exactly matches the required string,
//        including capitals, spaces, and punctuation marks.
//        Sample Input:
//        1
//        Sample Output:
//        move up

import java.util.Scanner;

public class Number_of_the_direction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextByte();

        switch (direction) {
            case 0: System.out.println("do not move");
                break;
            case 1: System.out.println("move up");
                break;
            case 2: System.out.println("move down");
                break;
            case 3: System.out.println("move left");
                break;
            case 4: System.out.println("move right");
                break;
            default:
                System.out.println("error!");
        }
    }
}
