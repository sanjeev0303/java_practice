// Print fibonacci series up to the given number

import java.util.*;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Here is the fibonacci series: ");
        printFibonacci(num);
    }


    public static void printFibonacci(int num ) {
        if(num < 0 ) return;
        System.out.print("0, ");
        if(num == 0) return;
        System.out.print("1, ");

        int first = 0 , second = 1;
        while (first + second <= num ) {
            int third = first + second ;
            System.out.print(third + ", ");
            first = second; 
            second = third;
        }
    }

}
