package Numeric_Patterns;
public class Pattern7 {
    public static void main(String[] args) {
        int n = 3;
        for(int i=1; i<=n; i++){
            int sp = n-i;
            int st = (2*n)-(2*sp)-1;
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
