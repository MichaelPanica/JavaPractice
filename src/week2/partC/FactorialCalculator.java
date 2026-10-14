package week2.partC;
/* • Create a class named `FactorialCalculator` with a method `calculate(int n)`
that returns the factorial of `n`.
• Demonstrate the method in your `main()` function */
public class FactorialCalculator {
    public static int calculate(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        System.out.println("The factorial number is " + calculate(3));
    }
}
