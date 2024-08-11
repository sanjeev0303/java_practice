// find the sum of all odd number in the given n number
import java.util.*;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        int sum = printOddSum(num);
        System.out.println("Odd sum till " + num + " is : " + sum);
        scanner.close();
    }


    public static int printOddSum(int num) {
        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum += i;
            i += 2;
        }

        return sum ;
    }
}
