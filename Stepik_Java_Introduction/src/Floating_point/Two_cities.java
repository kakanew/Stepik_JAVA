package Floating_point;

//Write a program that inputs the distance between the two cities in miles and
//        the travel time by bus in hours, and outputs the average speed of the bus.
//        Sample Input:
//        100
//        2
//        Sample Output:
//        50.0

import java.util.Scanner;

public class Two_cities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double hour = scanner.nextDouble();

        double speed = distance / hour;

        System.out.println(speed);
    }
}
