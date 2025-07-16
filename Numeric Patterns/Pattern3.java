public class Pattern3 {
    public static void main(String[] args) {
        int n = 3;
        for(int i=1;i<=n;i++){
            int sp = i-1;
            int num = n-sp;
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
