package week1.partA;
/*A company wants to calculate the weekly salary of its employees, who are paid a base
salary of £500 and receive £10 for each hour they work. Write a Java program that calculates
the weekly salary of an employee who has worked n hours*/

public class WeeklySalaryCalculator {
    public static void main(String[] args){
        double baseSalary = 500;
        double hourlyRate = 10;
        int hours = 40;

        double weeklyPay = baseSalary + hourlyRate * hours;
        double monthlyPay = weeklyPay * 4;
        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Monthly pay: " + monthlyPay);
    }
}
