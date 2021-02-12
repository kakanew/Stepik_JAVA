package Integer;

//Write a program that reads a three digit number, calculates the new
//        number by reversing its digits, and outputs the new number.
//        Sample Input:
//        907
//        Sample Output:
//        709

import java.util.Scanner;

public class Three_digit_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int dig1 = num / 100;
        int dig2 = (num / 10) % 10;
        int dig3 = num % 10;

        System.out.print(dig3);
        System.out.print(dig2);
        System.out.print(dig1);
    }
}
