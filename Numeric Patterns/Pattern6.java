public class Pattern6 {
    public static void main(String[] args) {
        int n=3;
        for(int i=0; i<3; i++){
            for(int j=(n-i);j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
