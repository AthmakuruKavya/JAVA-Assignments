package Assessment2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2:");
        int b = sc.nextInt();

        //Arithmetic Operators
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
        System.out.println("Modulus: "+ (a%b));

        //Relational Operators
        System.out.println("Greater than: "+ (a>b));
        System.out.println("Less than: "+ (a<b));
        System.out.println("Equal to: "+ (a==b));

        //Logical Operators
        System.out.println("Logical AND (a>5 && b<10): "+ (a>5 && b<10));
        System.out.println("Logical Or (a>10 || b<10): "+ (a>10 || b<10));

        //Bitwise Operators
        System.out.println("Bitwise AND: " + (a&b));
        System.out.println("Bitwise OR: "+ (a|b));
        System.out.println("Left Shift (a<<1): "+ (a<<1));
        System.out.println("Right Shift (a>>1): "+ (a>>1));

        sc.close();

    }
}
