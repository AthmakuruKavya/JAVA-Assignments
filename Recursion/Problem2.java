package Recursion;

public class Problem2 {
    static void fun(int n){
        int i=0;
        if(n>1){
            fun(n-1);
        }
        for(i=0; i<n; i++){
            System.out.print("*" +" ");
        }
    }
    public static void main(String[] args) {
        fun(3);
    }
}
