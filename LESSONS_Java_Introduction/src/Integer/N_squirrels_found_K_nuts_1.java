package Integer;

import java.util.Scanner;N squirrels found K nuts and decided to divide them equally.
//        Determine how many nuts each squirrel will get.
//        Input data format: There are two positive numbers N and K,
//        each of them is not greater than 10000.
//        Sample Input:
//        3
//        14
//        Sample Output:
//        4

public class N_squirrels_found_K_nuts_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();

        int equally = nuts / squirrels;

        System.out.println(equally);
    }
}
