package week2.partC;
/* Create a class `FibonacciGenerator` with a method `generate(int n)` that prints
the first `n` Fibonacci numbers
• The Fibonacci sequence is a series of numbers in which each number is the
sum of the two preceding numbers.
• The first two numbers in the Fibonacci sequence are 0 and 1.
• You can use a loop to iterate N times and calculate each subsequent number
in the sequence.
• Create a variable to keep track of the current number, and two variables to
store the previous two numbers.
• Use a `for` loop inside the method.
• Demonstrate it from the `main()` method. */
public class FibonacciGeneratorClass {


    public static int generate(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(firstNumber + " ");

            int result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        return firstNumber;
    }

    static void main(String[] args){
        int n = 5;

        generate(n);
    }

}

