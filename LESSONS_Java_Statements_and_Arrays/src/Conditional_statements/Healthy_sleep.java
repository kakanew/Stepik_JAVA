package Conditional_statements;

//Healthy sleep
//        Ann watched a TV program about health and learned that it is recommended to sleep
//        at least AA hours per day, but oversleeping is also not healthy and you should not sleep more than BB hours.
//        Now Ann sleeps HH hours per day. Determine if her sleep schedule complies with
//        the requirements of that TV program. If it does, print Normal.
//        If Ann sleeps fewer than AA hours, output Deficiency. If she sleeps more than BB hours, output Excess.
//        User inputs three strings with variables in the following order:
//        AA, BB, HH. AA is always less than or equal to BB.
//        Please note the output should exactly correspond to what is required in the problem,
//        including case-sensitivity. For example,
//        output such as "excess", "EXCESS", "ExCeSs" and others will not be graded as correct.
//        Think carefully about all the conditions you need to use.
//        Pay special attention to the strictness of the conditional operators you use:
//        distinguish between < and ≤; > and ≥. To understand which ones to use, re-read the problem if necessary.
//        Sample Input:
//        6
//        10
//        8
//        Sample Output:
//        Normal

import java.util.Scanner;

public class Healthy_sleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b && b >= a) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}
