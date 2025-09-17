package Recursion;

public class Power {
    public static void main(String[] args) {
        // System.out.println(pro(5,3));
        int b = 2;
        int p = 10;
        int val = 1;
        while (p > 0) {
            if((p&1) == 1){
                val = val * b;
            }
            p = p >> 1;
            b = b * b;
        }
        System.out.println(val);

    }
    // static int pro(int b, int p){
    // if(p<1){
    // return 1;
    // }
    // return 1*b*pro(b,--p);
    // }
}
