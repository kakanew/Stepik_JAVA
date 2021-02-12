package Integer;

//You’re given a two-digit number. Output its first digit (i.e. the number of tens).
//        Sample Input:
//        42
//        Sample Output:
//        4

import java.util.Scanner;

public class Two_digit_number {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int num1 = num / 10;

            System.out.println(num1);
        }
}
