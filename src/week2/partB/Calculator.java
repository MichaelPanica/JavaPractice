package week2.partB;
/* Write a Java program that calculates the sum of all the positive numbers less
than 100 that are divisible by 3 or 5. */


public class Calculator {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0; i < 100; i++){
            if (i % 3 == 0 || i % 5 == 0){
               sum += i;
            }
        }
        System.out.println(sum);
    }
}
