package Assessment4;

import java.util.Scanner;

//Function without Parameters, with Return Type

public class WithoutP {
    public static void main(String[] args) {
        System.out.println("Returned square: "+getSquare());
    }
    static int getSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        sc.close();
        return num*num;
    }
    
}
