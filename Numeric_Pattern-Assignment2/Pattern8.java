public class Pattern8 {
    public static void main(String[] args) {
        int n=7;
        int h = (n/2)+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==h || (i==n && j>h) || (i==1 && j<h)){
                    System.out.print("-");
                }else if((j==1 && i>h) || j==h || (j==n && i<h)){
                    System.out.print("|");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }       
    }
}
