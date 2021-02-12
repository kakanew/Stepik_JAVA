package Variables_and_Types;

//Write a program that reads two integer numbers from the standard input,
//        and then outputs them in the reverse order separated by a space.

import java.util.Scanner;

public class Two_integer_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(b + " " + a);
    }
}
