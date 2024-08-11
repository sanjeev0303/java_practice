// Calculate the Factorial of the given number

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for find factorial: ");
        int num = scanner.nextInt();
        long factorial = printFactorial(num);
        System.out.println("the factorial of " + num + " is: " + factorial);
        scanner.close();
    }

    public static long printFactorial(int num) {
        if (num < 2) {
            return 1;
        }
        int fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
