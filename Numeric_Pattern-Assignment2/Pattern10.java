public class Pattern10 {
    public static void main(String[] args) {
        int n= 6;
        for(int y=n; y>=-n; y--){
            for(int x=-n; x<=n; x++){
                int xval = Math.abs(x);
                int yval = Math.abs(y);
                System.out.print(((xval > yval)?xval:yval) + " ");
            }
            System.out.println();
        }
        
    }
    
    
}
