package week1.partB;
/*Write a Java program to calculate the average of three numbers you should use three
hardcoded numbers to demonstrate the concept*/
public class ArithmeticOne {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 34;
        int numberThree = 55;

        int sum = numberOne + numberTwo + numberThree;
        double average = (double) sum / 3;
            System.out.printf("The average number is %.2f", average);
    }

}
