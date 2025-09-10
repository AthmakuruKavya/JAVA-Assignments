package Recursion;

public class RecFlow {
    static void flow(int n){
        if(n==0){
            return;
        }
        flow(n/2);
        System.out.println(n);
        flow(n/2);
    }
    public static void main(String[] args) {
        flow(8);
    }
}
