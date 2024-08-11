// Check whether a given number is prime or not

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        int i = 2;
        
        while (i < num ) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
