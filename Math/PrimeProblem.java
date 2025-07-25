package Math;

import java.util.Scanner;

public class PrimeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=1;
        int count=0;
        int prime1 =-1;
        int prime2 = -1;
        while(true){
            if(isPrime(i)){
                count++;
                if(count==a){
                    prime1=i;
                }
                if(count==b){
                    prime2=i;
                    break;
                }
            }
            i++;
        }
        sc.close();
        // System.out.println(a +"th prime number = "+prime1);
        // System.out.println(b +"th prime number = "+prime2);

        int val1 = (int)(prime1*(prime1+1)/2);
        int val2 = (int)(prime2*(prime2+1)/2);
        int ans = val2 -val1;
        System.out.println(Math.abs(ans));
        System.out.println((int)('a'));
    }
    static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
    
}
