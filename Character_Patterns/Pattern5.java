package Character_Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        char ch ='A';
        int n=3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch=(char)(ch+1);
            }
            System.out.println();

        }
    }
    
}
