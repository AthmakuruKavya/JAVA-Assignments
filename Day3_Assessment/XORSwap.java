package Day3_Assessment;
import java.util.Scanner;

public class XORSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println("Before Swap: a= "+a+", b= "+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swap: a= "+a+", b= "+b);

        sc.close();

    }
}
