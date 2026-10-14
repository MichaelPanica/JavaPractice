package week2.partB;
/* Write a program that evaluates a student’s grade using a switch statement. The
program should
• The input should be a grade letter (A, B, C, D, or F).
• Display a message describing the performance.
• Handle invalid input using the default case.
Grade Message
A Excellent! First Class
B Very Good
C Good – Pass
D Satisfactory – Barely Pass
F Fail              */
import java.util.Locale;
import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter a grade (A, B, C, D or F): ");
        String grade = userInput.nextLine();
        switch (grade.toUpperCase()){
            case "A":
                System.out.print("Excellent! First Class");
                break;
            case "B":
                System.out.print("Very good!");
                break;
            case "C":
                System.out.println("Good - Pass");
            case "D":
                System.out.print("Satisfactory - Barely pass");
                break;
            case "F":
                System.out.print("Fail");
                break;
            default: System.out.print("Sorry, you must enter a grade (A, B, C, D or F)");

        }
    }
}
