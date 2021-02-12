package Integer;

//You have been given the values of the two moments in time from the same day both in the format:
//        hours, minutes and seconds. It is known that the second moment in time happened not earlier than the first one.
//        Find how many seconds passed between these two moments of time.
//        Input data format: The program gets the input of the three integers:
//        hours, minutes, seconds, defining the first moment of time,
//        and three integers that define the second moment time.
//        Output data format: Output the number of seconds between these two moments of time.
//        Sample Input 1:
//        1
//        1
//        1
//        2
//        2
//        2
//        Sample Output 1:
//        3661
//        Sample Input 2:
//        1
//        2
//        30
//        1
//        3
//        20
//        Sample Output 2:
//        50

import java.util.Scanner;

public class Hours_minutes_and_seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //                           Input 1 / Input 2
        int hor1 = scanner.nextInt(); // 1   / 1
        int min1 = scanner.nextInt(); // 1   / 2
        int sec1 = scanner.nextInt(); // 1   / 30
        int sum1 = (hor1 *= 3600) + (min1 *= 60) + (sec1 *= 1);

        //                           Input 1 / Input 2
        int hor2 = scanner.nextInt(); // 2   / 1
        int min2 = scanner.nextInt(); // 2   / 3
        int sec2 = scanner.nextInt(); // 2   / 20
        int sum2 = (hor2 *= 3600) + (min2 *= 60) + (sec2 *= 1);

        System.out.println(sum2 - sum1);
    }
}
