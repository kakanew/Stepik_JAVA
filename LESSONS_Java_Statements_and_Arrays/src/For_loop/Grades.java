package For_loop;

//Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in the
//class consisting of n students. The program gets number n as input,
//        and then gets the grades themselves (one by one).
//        The program should output four numbers in a single line -
//        the number of "D", the number of "C", the number of "B" and the number of "A" grades.
//        Sample Input:
//       12
//        4
//        2
//        5
//        4
//        4
//        5
//        4
//        3
//        5
//        5
//        5
//        4
//        Sample Output:
//        1 1 5 5

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < num; i++) {
            int grade = scanner.nextInt();
            switch (grade) {
                case 2:
                    a++;
                    break;
                case 3:
                    b++;
                    break;
                case 4:
                    c++;
                    break;
                case 5:
                    d++;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + grade);
            }
        }
        System.out.print(a + " " + b + " " + c + " " + d);
    }
}
