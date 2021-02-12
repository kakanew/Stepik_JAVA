package Array;

//Write a program that reads an unsorted array of integers and two numbers n and m.
//        The program must check if n and m occur next to each other in the array (in any order).
//        Input data format
//        The first line contains the size of an array.
//        The second line contains elements of the array.
//        The third line contains two integer numbers n and m.
//        All numbers in the same line are separated by the space character.
//        Output data format
//        Only a single value: true or false.
//        Sample Input:
//        3
//        1 3 2
//        2 3
//        Sample Output:
//        true

import java.util.Scanner;

public class Unsorted_array_of_integers {
    public static void main(String[] args) {
        //put your code here
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        int n = s.nextInt();
        int m = s.nextInt();
        int a = 0;
        int b = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == n) {
                a = index;
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] == m) {
                b = index;
            }
        }

        if (a == b - 1 || b == a - 1) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}
