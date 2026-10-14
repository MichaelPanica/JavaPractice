package week2.partA;
/* Write a Java Program that takes a number n as input and compute the factorial
(n!) using a for loop */
import java.util.Scanner;

public class FactorialNumber{
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    try {
        System.out.println("Please enter a number.");
        int n = userInput.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n ; i++ ){
            factorial = factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    } catch (Exception e){
        System.out.print("Sorry, you must enter a number.");
    }
    }
}
