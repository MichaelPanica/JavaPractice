package week2.partA;
import java.util.Scanner;
/*Write a Java program that reads an integer and prints whether it is even or odd*/

public class OddOrEven {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number. ") ;
        try {
            int firstNumber = userInput.nextInt();
            if (firstNumber % 2 == 0) {
                System.out.printf("%d is even", firstNumber);
            } else {
                System.out.printf("%d is odd.", firstNumber);
            }
        } catch (Exception e){
             System.out.println("Sorry, you must enter a number.");
        }
    }
}
