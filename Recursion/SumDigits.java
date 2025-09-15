package Recursion;

public class SumDigits {
    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n<1){
            return 0;
        }
        int rem = n%10;
        return rem+sum(n/10);
    }
}
