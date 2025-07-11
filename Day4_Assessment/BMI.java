package Assessment4;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight = ");
        int w = sc.nextInt();
        System.out.print("Height = ");
        float h = sc.nextFloat();

        float bmi = w / (h*h);
        // System.out.printf("BMI =%.2f ",bmi);  // to print upto two decimal points only in java
        System.out.println("BMI = "+bmi);

        sc.close();
    }
}
