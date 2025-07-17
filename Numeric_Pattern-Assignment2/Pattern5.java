public class Pattern5 {
    public static void main(String[] args) {
        int n=6;
        int oval=(2*n)-1;
        int eval = 1;
        for(int i=1; i<=n; i++){
            int val = i;
            for(int j=1; j<=n; j++){
                System.out.print(val+" ");
                if(j%2 == 1){
                    val+=oval;
                }else{
                    val+=eval;
                }
            }
            oval-=2;
            eval+=2;
            System.out.println();
        }
    }
}
