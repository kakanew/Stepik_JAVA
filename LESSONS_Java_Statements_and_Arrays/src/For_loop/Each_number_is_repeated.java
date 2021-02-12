package For_loop;

//Print the sum of all integers from a to b (a < b).
//        Sample Input:
//        6
//        18
//        Sample Output:
//        156

import java.util.Scanner;

public class Each_number_is_repeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for (; a <= b; a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
