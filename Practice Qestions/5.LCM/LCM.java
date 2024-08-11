// find the LCM

import java.util.*;

class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        int result = printLCM(first, second);
        System.out.print("The LCM of two numbers is: " + result);
        scanner.close();
    }

    public static int printLCM(int first, int second) {

        int i = 1;

        while (i <= second) {
            int factor = first * i;

            if (factor % second == 0) {
                return factor;
            }
            i++;
        }

        return 0;
    }
}
