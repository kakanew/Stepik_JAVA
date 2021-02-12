package String;

//Write a program that reads a string and checks whether it is a palindrome,
//        i.e. it reads the same both left-to-right and right-to-left.
//        The program must output “yes” if the string is a palindrome and “no” otherwise.
//        Sample Input:
//        kayak
//        Sample Output:
//        yes

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        String palindrome = "yes";
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                palindrome = "no";
            }
        }
        System.out.println(palindrome);
    }
}
