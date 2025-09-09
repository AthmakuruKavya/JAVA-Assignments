package Recursion;

public class PrintNums {
    static void print(int n){
        if(n==0){
            return;
        }
        //System.out.println(n);  //5 4 3 2 1
        print(n-1);
        System.out.println(n);  // 1 2 3 4 5
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
