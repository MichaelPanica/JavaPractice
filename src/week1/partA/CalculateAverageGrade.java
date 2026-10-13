package week1.partA;
/* A student has taken 4 exams and wants to calculate his average exam score. Write a Java
program that calculates the average of 4 hardcoded exam scores. */


public class CalculateAverageGrade {
    public static void main(String[] args){
        int[] grades = {89, 75, 90, 55};
        double sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("The average mark is: " + average);
    }
}
