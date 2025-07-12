package Day3_Assessment;

import java.util.Scanner;

public class IncDec {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Original: "+num);
        System.out.println("Pre Increment: "+ (++num));
        System.out.println("Post-Increment: "+ (num++) + "(printed), then becomes "+ (num));
        System.out.println("Pre-Decrement: "+ (--num));
        System.out.println("Post-Decrement: "+ (num--)+" (printed), then becames "+ num);

        sc.close();
    }
}
