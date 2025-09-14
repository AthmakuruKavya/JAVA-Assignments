package Recursion;

public class Problem3 {
    static int fun(int n){
        int x =1;
        if(n==1){
            return x;
        }
        for(int k=1; k<n; k++){
            x = x+ fun(k) * fun(n-k);
        }
        return x;
    }
    public static void main(String[] args) {
        int val = fun(5);
        System.out.println(val);
    }
}
