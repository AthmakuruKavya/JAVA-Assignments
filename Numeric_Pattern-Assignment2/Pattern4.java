public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            int cval=i;
            for(int j=1; j<=n; j++){
                System.out.print(cval+" ");
                cval+=5;
            }
            System.out.println();
        }
    }
}
