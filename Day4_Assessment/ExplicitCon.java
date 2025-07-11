package Assessment4;

import java.util.Scanner;

// Assignment 4: Explicit Type Casting
// Question:
// Convert a float to int and byte using casting.
// Input Format:
// float f = 123.456f;
// Output Format:
// To int: 123
// To byte: 123


public class ExplicitCon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Float f: ");
        float f = sc.nextFloat();

        System.out.println("To int: "+ (int) f);
        System.out.println("To byte: "+ (byte) f);
        sc.close();
    }
}
