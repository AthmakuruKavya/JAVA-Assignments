package Pattern_Assessment;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 3;
        for(int i=0; i<n; i++){
            int sp = 2*(n-i-1);
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
