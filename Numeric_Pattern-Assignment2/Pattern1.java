class Pattern1{
    public static void main(String[] args) {
        int n = 3;
        for(int i=1; i<=n; i++){
            int cval = 1;
            int sp = 2*(n-i);
            for(int j=1; j<=i; j++){
                System.out.print(cval);
                cval++;
            }
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(cval-1);
                cval--;
            }
            System.out.println();
        }
    }
}