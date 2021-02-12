package For_loop;

//Arithmetic average
//        Write a program that reads two numbers aa and bb from the keyboard,
//        calculates and outputs to the console the arithmetic average of all numbers from the interval
//        [a; b][a;b], which are divided by 33.
//        In the example below the arithmetic average is calculated for the numbers on the interval
//        [-5; 12][−5;12]. Total numbers divided by 33 on this interval 66: -3, 0, 3, 6, 9, 12−3,0,3,6,9,12.
//        Their arithmetic average equals to 4.54.5
//        The program input contains intervals, which always contain at least one number, which is divided by 33.
//        Sample Input:
//        -5
//        12
//        Sample Output:
//        4.5

import java.util.Scanner;

public class Arithmetic_average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        float count = 0.0f;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println(sum / count);
    }
}
