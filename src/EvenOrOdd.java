/*Write a Java program that reads an integer and prints whether it is even or odd*/
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch(NumberFormatException e){
            System.out.println("Error - Please enter a number.");
        }
    }
}