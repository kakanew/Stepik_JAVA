package Switch_statements;

//A simple calculator
//        Write a simple calculator that reads three values from a line: the first number,
//        the operator, and the second number, separated by single spaces.
//        The program should apply the operation to the entered numbers and output
//        the numerical result to the screen. Note that the numbers are long.
//        The calculator should support the following operations / operators:
//        addition: "+"
//        subtraction: "-"
//        integer division: "/"
//        multiplication: "*"
//        If division is requested and the second number is 0, output Division by 0!
//        If no valid operator is present, output Unknown operator.
//        Note: Consider using the switch statement in your solution.
//        Sample Input:
//        10000000000 + 20000000000
//        Sample Output:
//        30000000000A simple calculator
//        Write a simple calculator that reads three values from a line: the first number,
//        the operator, and the second number, separated by single spaces.
//        The program should apply the operation to the entered numbers and output the numerical
//        result to the screen. Note that the numbers are long.
//        The calculator should support the following operations / operators:
//        addition: "+"
//        subtraction: "-"
//        integer division: "/"
//        multiplication: "*"
//        If division is requested and the second number is 0, output Division by 0!
//        If no valid operator is present, output Unknown operator.
//        Note: Consider using the switch statement in your solution.
//        Sample Input:
//        10000000000 + 20000000000
//        Sample Output:
//        30000000000

import java.util.Scanner;

public class A_simple_calculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong();
    char operator = scanner.next().charAt(0);
    long y = scanner.nextLong();

        switch (operator) {
        case '+': System.out.print(x+y); break;
        case '-': System.out.print(x-y); break;
        case '/':
            if (y == 0){
                System.out.println("Division by 0!");
            } else {
                System.out.println(x/y);
            }
            break;
        case '*': System.out.print(x*y); break;

        default: System.out.print("Unknown operator");
    }
}
}
