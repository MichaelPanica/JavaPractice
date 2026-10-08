/*Write a Java Program that takes a mark as input and classify it.*/
import java.util.Scanner;

public class MarkInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mark:");


        try {
            int grade = Integer.parseInt(input.nextLine());
            if (grade >= 70){
                System.out.println(grade + "% is First Class.");
            } else if (grade >= 40) {
                System.out.println(grade + "% is Second Class.");
            } else {
                System.out.println(grade + "% is Fail.");
            }
        } catch (NumberFormatException e){
            System.out.println("Error. Please enter a valid number.");
        }
        input.close();
    }
}
