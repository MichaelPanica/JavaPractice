package week3;

import java.util.Scanner;
public class Debugging {
    public static void main(){
        Scanner in = new Scanner(System.in);

        String first = in.next();
        String rest = in.nextLine();
        int n = in.nextInt();
        String city = in.nextLine();

        System.out.println("[" + first + "]");
        System.out.println("[" + rest + "]");
        System.out.println(n*2);
        System.out.println("[" + city + "]");
    }
}
