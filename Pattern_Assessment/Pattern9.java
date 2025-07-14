package Pattern_Assessment;

public class Pattern9 {
    public static void main(String[] args) {
        int n =3;
        for(int i=1; i<=3; i++){
            int sp = i-1;
            int st = (n*2)-i-sp;
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
