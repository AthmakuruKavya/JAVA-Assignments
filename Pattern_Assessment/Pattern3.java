package Pattern_Assessment;

public class Pattern3 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            int sp = 3-i;
            int st = i;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
