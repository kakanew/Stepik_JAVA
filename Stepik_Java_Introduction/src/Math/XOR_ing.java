package Math;

//You have been given a natural number N, which is not less than 10.
//        Output the result of XOR'ing the two last digits of this number.
//        Sample Input 1:
//        11
//        Sample Output 1:
//        0
//        Sample Input 2:
//        12
//        Sample Output 2:
//        3

import java.util.Scanner;

public class XOR_ing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int dig1 = (num / 10) % 10;
        int dig2 = num % 10;

        int bitwiseOr = dig1 ^ dig2;

        System.out.print(bitwiseOr);
    }
}
