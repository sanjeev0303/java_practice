// Sum of the digits of the digits of the integer

import java.util.*;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int sum = printSumOfDigit(num);
        System.out.println("the sum the digits of the " + num + " is:" + sum);
        scanner.close();
    }

    public static int printSumOfDigit(int num) {
        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num/10;
        }
        return sum ;
    }
}