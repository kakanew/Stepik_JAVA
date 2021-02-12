package Array;

//Write a program that reads an array of ints and outputs
//        the maximum pairwise product in the given array of non-negative numbers.
//        If the array has only one element then output the element.
//        Input data format
//        The first line of the input contains the number of elements in the array.
//        The second line contains the elements of the array separated by spaces.
//        The array always has at least one element.
//        Sample Input:
//        2
//        5 3
//        Sample Output:
//        15

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_pairwise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        if (arr.length == 1) {
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[arr.length - 1] * arr[arr.length - 2]);
        }
    }
}
