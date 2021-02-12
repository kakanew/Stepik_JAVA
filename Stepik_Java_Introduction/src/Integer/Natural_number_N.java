package Integer;

//You have been given a natural number N, not greater than 10000.
//        Output the even number following this N.
//        Sample Input 1:
//        7
//        Sample Output 1:
//        8
//        Sample Input 2:
//        8
//        Sample Output 2:
//        10

import java.util.Scanner;

public class Natural_number_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + 2);
        } else {
            System.out.println(num + 1);
        }
    }
}
