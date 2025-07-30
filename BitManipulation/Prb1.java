package BitManipulation;

public class Prb1 {
    public static void main(String[] args) {
        // int x =5;
        // int pos =5;
        // int bit = x<<(pos-1);
        // x= x | bit;
        // System.out.println(x);
        int n=13;
        int pos  =3;
        int bit = ~ ( 1<< (pos-1));
        int ans = n&bit;
        System.out.println(ans);
    }
    
}
