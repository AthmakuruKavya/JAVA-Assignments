package Recursion;

public class Problem4 {
    static void count(int n){
         int d = 1;
        System.out.print(n+" ");
        System.out.print(d+" ");
        d++;
        if(n>1){
            count(n-1);
        }
        System.out.print(d+" ");
    }
    public static void main(String[] args) {
        count(3);
    }
}
