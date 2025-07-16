package Pattern_Assessment;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            int sp = i;
            int st = 3-i;
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=0; j<st; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
