package Day3_Assessment;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a num : ");

        int num = sc.nextInt(); //The number 7 is Odd

        String r = (num%2 == 0) ? "The number "+ num +" is odd" : "The number "+ num +" is Odd";

        System.out.println(r);

        sc.close();
    }
}
