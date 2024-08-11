// package MultiplilcationTable;

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table World!");
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
        scanner.close();
    }

    public static void printMultiplicationTable(int num) {
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
        
    }
}