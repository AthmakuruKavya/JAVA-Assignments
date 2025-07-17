package Character_Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        char ch ='A';
        int n =3;
        for(int i=1; i<=n; i++){
            if(i>2){
                ch--;
            }
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();

        }
    }
}
