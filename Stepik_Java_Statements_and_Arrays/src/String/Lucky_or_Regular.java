package String;

//Paul loves to ride public transport and after receiving the ticket,
//        he immediately checks whether he got the lucky one.
//        A ticket is considered a lucky one if the sum of the first three numbers
//        in this ticket matches the sum of the last three numbers in the same ticket.
//        However, Paul does not count well in head that is why he asks you to write the program,
//        which will check the equality of the sums and display "Lucky" if the sums match, and "Regular" if the sums differ.
//        A string of six digits is provided as input to the program.
//        You need to print out only the word "Lucky" or "Regular" with a capital letter (without quotes).
//        Sample Input:
//        090234
//        Sample Output:
//        Lucky

import java.util.Scanner;

public class Lucky_or_Regular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txtNumber = scan.nextLine();
        String substr1 = txtNumber.substring(0, 3);
        String substr2 = txtNumber.substring(3, 6);
        int sum1 = 0;
        int sum2 = 0;

        for (int i=0;i<txtNumber.length() / 2; i++) {
            sum1 += substr1.charAt(i);
            sum2 += substr2.charAt(i);
        }

        String response = (sum1 == sum2) ? "Lucky" : "Regular" ;
        System.out.println(response);
    }
}
