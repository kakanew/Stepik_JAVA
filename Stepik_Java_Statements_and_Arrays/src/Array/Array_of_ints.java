package Array;

//Write a program that reads an array of ints named A and cyclically shift
//        the elements of the array to the right: A[0] goes to the place of A[1],
//        A[1] - to the place of A[2], ..., and the last element goes to the place of A[0]).
//        Input data format
//        The first line of the input contains the number of elements in the array.
//        The second line – the elements of the array.
//        Output data format
//        The single line contains all shifted elements of the array.
//        Elements must be separated by the space character.
//        Sample Input:
//        5
//        1 2 3 4 5
//        Sample Output:
//        5 1 2 3 4

import java.util.Scanner;

public class Array_of_ints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numArr = new int[len];
        for (int i = 0; i < len; i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int i = len - 1; i > 0; i--) {
            int tmp = numArr[i - 1];
            numArr[i - 1] = numArr[i];
            numArr[i] = tmp;
        }
        for (int num:numArr) {
            System.out.print(num + " ");
        }
    }
}
