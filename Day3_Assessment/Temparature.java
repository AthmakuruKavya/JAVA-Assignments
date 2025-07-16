package Day3_Assessment;
import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius = ");
        int C = sc.nextInt(); 
        float F = (C * 9/5f) + 32;
        System.out.println("Fahrenheit: "+F);
        sc.close();
    }
}
