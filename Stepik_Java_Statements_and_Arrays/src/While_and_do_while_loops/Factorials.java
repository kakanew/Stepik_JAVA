package While_and_do_while_loops;

//The user inputs a long number M. Find out the smallest long n such that n! > M.
//        Hint: For more about factorials, see this Wikipedia article.
//        Sample Input:
//        6188989133
//        Sample Output:
//        13

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long fac = 1;
        int i = 1;
        do {
            fac = fac * i;
            i++;
        } while (fac <= num);
        System.out.println(i - 1);
    }
}
