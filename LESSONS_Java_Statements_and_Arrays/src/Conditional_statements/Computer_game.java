package Conditional_statements;

//In a computer game, a player has an army of units.
//        Write a program that will classify the player's army according to the following rules:
//        Total units: Category
//        fewer than 1: no army
//        from 1 to 4: few
//        from 5 to 9: several
//        from 10 to 19: pack
//        from 20 to 49: lots
//        from 50 to 99: horde
//        from 100 to 249: throng
//        from 250 to 499: swarm
//        from 500 to 999: zounds
//        1000 or more: legion
//        User inputs the number of units. The program outputs the corresponding category.
//        Sample Input:
//        5
//        Sample Output:
//        several

import java.util.Scanner;

public class Computer_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("no army");
        } else if (num >= 1 && num <= 4) {
            System.out.println("few");
        } else if (num >= 5 && num <= 9) {
            System.out.println("several");
        } else if (num >= 10 && num <= 19) {
            System.out.println("pack");
        } else if (num >= 20 && num <= 49) {
            System.out.println("lots");
        } else if (num >= 50 && num <= 99) {
            System.out.println("horde");
        } else if (num >= 100 && num <= 249) {
            System.out.println("throng");
        } else if (num >= 250 && num <= 499) {
            System.out.println("swarm");
        } else if (num >= 500 && num <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
