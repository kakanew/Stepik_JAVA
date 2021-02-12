package String;

//In the given string find the first longest word and output it.
//        Input data
//        Given a string in a single line. Words in the string are separated by a single space.
//        Output data
//        Output the longest word. If there are several such words, you should output the one, which occurs earlier.
//        Sample Input:
//        one two three four five six
//        Sample Output:
//        three

import java.util.Scanner;

public class The_first_longest_word {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        String[] array = line.split(" ");
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > array[index].length()) {
                index = i;
            }
        }
        System.out.println(array[index]);
    }
}
