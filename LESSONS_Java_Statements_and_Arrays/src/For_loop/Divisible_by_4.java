package For_loop;

//Given a sequence of natural numbers, not exceeding 30000. Find the its maximum element divisible by 4.
//        As input, the program gets the number of elements in the sequence, and then the elements themselves.
//        In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
//        The program should print the single number – the maximum element of the sequence divisible by 4.
//        Sample Input:
//        9
//        12
//        56
//        16
//        36
//        52
//        17
//        24
//        80
//        5
//        Sample Output:
//        80

import java.util.Scanner;

public class Divisible_by_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < number; i++) {
            int nextNumber = scanner.nextInt();
            if (nextNumber > max && nextNumber % 4 == 0) {
                max = nextNumber;
            }
        }
        System.out.println(max);
    }
}
