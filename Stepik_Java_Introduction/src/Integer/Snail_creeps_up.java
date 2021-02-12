package Integer;

//Snail creeps up the vertical pole of height H feets.
//        Each day it goes A feets up, and each night it goes B feets down.
//        On which day will the snail reach the top of the pole?
//        Input data format: On the input the program receives non-negative integers
//        H, A, B, where H > B and A > B. Every integer does not exceed 100.
//        Sample Input 1:
//        10
//        3
//        2
//        Sample Output 1:
//        8
//        Sample Input 2:
//        20
//        7
//        3
//        Sample Output 2:
//        5

import java.util.Scanner;

public class Snail_creeps_up {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();

        int days = (height - night - 1) / (day - night) + 1;

        System.out.println(days);
    }
}
