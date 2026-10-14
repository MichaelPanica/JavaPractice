package week3;

import java.util.Scanner;
public class Debugging {
    public static void main(){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your first name. ");
        String first = in.nextLine();
        System.out.println("Please enter your surname");
        String rest = in.nextLine();
        System.out.println("Please enter your age.");
        int n = Integer.parseInt(in.nextLine().strip());
        System.out.println("Please enter your city. ");
        String city = in.nextLine();

        System.out.println("Your first name is " + first);
        System.out.println("Your surname is " + rest);
        System.out.println("You are " + n + " years old");
        System.out.println("And you live in " + city);
        in.close();
    }
}
