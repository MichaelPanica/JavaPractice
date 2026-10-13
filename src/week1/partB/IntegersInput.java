package week1.partB;
import java.util.Scanner;

/*Write a Java program that takes two integers as input and calculates their remainder when
divided by 7. The program should then print the result.*/
public class IntegersInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Create a scanner object.
        System.out.println("Please enter a number.");
        int number = input.nextInt();
        System.out.println("Please enter the second number.");
        int secondNumber = input.nextInt();

        float reminder = number % secondNumber;
        System.out.printf("Your numbers are %d and %d, and the reminder of the numbers is %.2f",
                number,
                secondNumber,
                reminder);

    }
}
