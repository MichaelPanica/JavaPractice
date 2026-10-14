package week2.partA;
/*  Write a Java Program that takes a mark as input and classify it. */
import java.util.Scanner;

public class IntegerClassification {
    static void main(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 100: \n");
        try {
            double mark = userInput.nextDouble();
        if (mark > 101) {
            System.out.println("You got more than 100? ...how?");
        } else if (mark >= 70 && mark <= 100) {
            System.out.println("First Class");
            } else if (mark <= 69 && mark >= 40){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        } catch (Exception e){
            System.out.print("Sorry, you must enter a number between 0 and 100");
        }
    }
}
