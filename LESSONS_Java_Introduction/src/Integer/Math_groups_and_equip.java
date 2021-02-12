package Integer;

//Some schools have decided to create three new math
//        groups and equip the classrooms for them with the new desks.
//        Only two students may sit at any one desk.
//        The number of students in each of the three groups is known.
//        Output the smallest amount of desks, which will need to be purchased.
//        Each new group sits in its own classroom.
//        Input data format: The program receives the input of the three non-negative integers:
//        the number of students in each of the three classes (the numbers do not exceed 1000).
//        Sample Input 1:
//        20
//        21
//        22
//        Sample Output 1:
//        32
//        Sample Input 2:
//        16
//        18
//        20
//        Sample Output 2:
//        27

import java.util.Scanner;

public class Math_groups_and_equip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //                            Sample1    /  Sample2
        int grup1 = scanner.nextInt(); //   20    /    16
        int grup2 = scanner.nextInt(); //   21    /    18
        int grup3 = scanner.nextInt(); //   22    /    20
        int sum1 = grup1 / 2 + grup1 % 2;
        int sum2 = grup2 / 2 + grup2 % 2;
        int sum3 = grup3 / 2 + grup3 % 2;

        System.out.println(sum1 + sum2 + sum3);
    }
}
