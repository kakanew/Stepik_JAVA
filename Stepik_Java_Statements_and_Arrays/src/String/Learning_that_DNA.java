package String;

//Upon learning that DNA is not a random string,
//        freshmen of the Bioinformatics Institute from the informatics
//        group suggested using a compression algorithm that compresses repeated characters in a string.
//        Encoding is performed as follows:
//        The string "aaaabbсaa" is converted into "a4b2с1a2", that is,
//        the groups of the same characters of the input string are replaced by
//        the symbol and the number of its repetitions in this string.
//        Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence.
//        The encoding must be case sensitive.
//        Sample Input:
//        aaaabbcaa
//        Sample Output:
//        a4b2c1a2

import java.util.Scanner;

public class Learning_that_DNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char el = line.charAt(0);
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == el) {
                count++;
            } else {
                System.out.print(el);
                System.out.print(count);
                el = line.charAt(i);
                count = 1;
            }
        }
        System.out.print(el);
        System.out.print(count);
    }
}
