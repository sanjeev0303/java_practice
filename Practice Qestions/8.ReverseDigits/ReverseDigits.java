// Reverse the digits in the given number

import java.util.*;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int reverse = printReverseDigit(num);
        System.out.print("The reverse of the " + num + " is: " + reverse);
    }

    public static int printReverseDigit(int num) {
        int newNum = 0;

        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }

        return newNum;
    }

}
