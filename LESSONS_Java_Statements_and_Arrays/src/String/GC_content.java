package String;

//GC-content is an important feature of the genome sequences and is defined as
//        the percentage ratio of the sum of all guanines and cytosines to
//        the overall number of nucleic bases in the genome sequence.
//        Write a program, which calculates the percentage of
//        G characters (guanine) and C characters (cytosine) in the entered string.
//        Your program should be case independent.
//        For example, in the string "acggtgttat" the percentage of characters
//        G and C equals to \dfrac4{10} \cdot 100 = 40.0
//        10 4 ⋅ 100 = 40.0, where 4 is the number of symbols G and C, and 10 is the length of the string.
//        Input data format
//        The single input line contains a sequence.
//        Output data format
//        The percentage of G an C characters as a double. Do not round/format the value, output it as is.
//        Sample Input:
//        acggtgttat
//        Sample Output:
//        40.0

import java.util.Scanner;

public class GC_content {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        double prc = 0;
        double cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' || str.charAt(i) == 'c') {
                cnt++;
            }
        }

        if (str.length() > 0) {
            prc = cnt / str.length() * 100d;
        }

        System.out.println(prc);
    }
}
