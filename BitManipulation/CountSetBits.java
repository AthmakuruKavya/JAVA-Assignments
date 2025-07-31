package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        // while(n>0){
        //     if((n&1) == 1){
        //         count++;
        //     }
        //     n=n>>1;
        // }


        while(n>0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
