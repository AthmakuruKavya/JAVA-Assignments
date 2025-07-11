package Day5_Assessment;

import java.util.Scanner;

//Assignment 7: Use do-while loop to Print Sum Until User Enters Zero

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,num;
        do{
            // System.out.print("Enter a num: ");
            num = sc.nextInt();
            sum+=num;
        }while(num>0);

        System.out.println("Sum= "+sum);

        sc.close();

    }
}
