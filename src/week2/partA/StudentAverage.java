package week2.partA;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter 5 marks:");

        for (int i = 0; i <= marks.length; i++) {
            marks[i] = input.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = marks[i];
        }

        double average = (double) sum / marks.length;

        System.out.println("Average mark: " + average);

        if (average >= 70) {
            System.out.println("First Class");
        } else if (average >= 40) {
            System.out.println("Pass");
        } else if (average < 0 || average > 100) {
            System.out.println("Invalid average");
        } else {
            System.out.println("Fail");
        }
    }
}