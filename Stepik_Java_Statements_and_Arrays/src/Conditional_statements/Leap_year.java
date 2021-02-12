package Conditional_statements;

//Given a year, find out if it is a leap year.
//        As a reminder, leap years are those divisible by 4 but not by 100,
//        as well as those divisible by 400. For example, 2000 was a leap year, but 2100 will be a regular year.
//        The program should work correctly for years 1900 ≤ n ≤ 3000.
//        Output Leap (case-sensitive) if the given year is a leap year, and Regular otherwise.
//        Sample Input 1:
//        2100
//        Sample Output 1:
//        Regular
//        Sample Input 2:
//        2000
//        Sample Output 2:
//        Leap

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 4 == 0 && n % 100 != 0) {
            System.out.print("Leap");
        } else if (n % 400 == 0) {
            System.out.print("Leap");
        } else {
            System.out.print("Regular");
        }
    }
}
