package Array;

//Write a program that read an array of ints and finds the index of the first maximum in an array.
//        Input data format
//        The first line contains the number of elements in the array.
//        The second line contains the array elements separated by spaces.
//        An array always has at least one element.
//        Output data format
//        Only a single integer value - the index of the first maximum.
//        Sample Input:
//        5
//        2 5 3 4 5
//        Sample Output:
//        1

import java.util.Scanner;

public class First_maximum_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int maxNum = 0;
        int indexMaxNum = 0;

        if (arr.length != 1) {
            for (int i = 0; i < len; i++) {
                if (arr[i] > maxNum) {
                    maxNum = arr[i];
                    indexMaxNum = i;
                }
            }
        }
        System.out.println(indexMaxNum);
    }
}
