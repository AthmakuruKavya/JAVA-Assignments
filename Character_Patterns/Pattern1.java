package Character_Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        char ch ='A';
        int n=3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
