package Pattern_Assessment;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 3;
        for(int i=n-1;i>=0;i--){
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
