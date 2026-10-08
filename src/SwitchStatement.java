/*Write a program that evaluates a student’s grade using a switch statement. The
program should*/
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade (Must be A,B,C,D or F): ");
        String grade = scanner.nextLine().toUpperCase();

        switch(grade){
            case "A":
                System.out.println("Excelent! First Class!");
                break;
            case "B":
                System.out.println("Very good");
                break;
            case "C":
                System.out.println("Good - Pass");
                break;
            case "D":
                System.out.println("Satisfactory - Barely Pass");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Error, invalid grade");
        }
    }
}
