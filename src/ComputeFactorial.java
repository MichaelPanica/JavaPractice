/*Write a Java Program that takes a number n as input and compute the factorial
(n!) using a for loop.*/
import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        try {
            int n = Integer.parseInt(scanner.nextLine());
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println(n + "! = " + factorial);

        } catch (NumberFormatException e) {
            System.out.println("Error - please enter a number.");
        }
        scanner.close();
    }
}