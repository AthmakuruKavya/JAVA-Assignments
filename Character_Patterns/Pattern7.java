package Character_Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x=-n; x<=n; x++){
            char ch ='a';
            for(int y=n;y>=-n;y--){
                int val1 = Math.abs(x);
                int val2 = Math.abs(y);
                if(val1 > val2){
                    System.out.print((char)(ch+val1)+" ");
                }else{
                    System.out.print((char)(ch+val2)+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
