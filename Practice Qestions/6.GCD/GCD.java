// find the Greatest common factor of the given integer

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the seconde number: ");
        int second = scanner.nextInt();
        int GCD = printGCD(first, second);
        System.out.print("Greatest Common Factor of two integer is: " + GCD);
        scanner.close();
    }


    public static int printGCD(int first, int second) {
        int gcd = 1;
        int i = 2;
        int smallest = smallest(first, second);

        while (i <= smallest) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;    
            }
            i++;
        }

        return gcd;
    }


    public static int smallest(int num1 , int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
