package Day3_Assessment;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length = ");
        int len = sc.nextInt();
        System.out.print("Breadth = ");
        int bre = sc.nextInt();
        System.out.println("Area = "+ len*bre);
        System.out.println("Perimeter = "+2*(len+bre));
        sc.close();
    }
}
