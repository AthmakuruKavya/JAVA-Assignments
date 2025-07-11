package Assessment4;

import java.util.Scanner;

// Function with Parameters & Return Type

public class WithPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greater number is: "+max(a, b));

        sc.close();
    }
    static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    }
}
