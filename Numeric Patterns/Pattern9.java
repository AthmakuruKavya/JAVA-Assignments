public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            int sp = n-i;
            // int st = (2*n)-(2*sp)-1;
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            if(i>=2){
                for(int j=i-1;j>=1;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
