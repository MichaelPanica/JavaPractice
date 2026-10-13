package week1.partA;
/*A person wants to save £1000 in a year. They want to know how much money they need
to save each month to reach their goal. Write a Java program that calculates the monthly
savings required to reach a goal of £1000 in one year.*/
public class SavingsCalculator {
    public static void main(String[] args){
        int months = 12;
        int totalSavings = 1000;
        double monthlySavings = (double) totalSavings / months;

        System.out.printf("You must save £%.3f per month to reach £%d in %d months.",
        monthlySavings,
        totalSavings,
        months);
    }
}
