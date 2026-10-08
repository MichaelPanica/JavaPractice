
/*Write a Java program to find all prime numbers up to the last three digit of
your student number e.g. if your student number is 24829999 the given limit
would be n=999 using loo*/

public class FindPrimeNumbers {
    public static void main(String[] args){
        int limit = 256;

        for(int num = 2; num <= limit; num++){
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
        }

    }
}
