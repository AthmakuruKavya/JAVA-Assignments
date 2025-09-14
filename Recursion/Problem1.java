package Recursion;
public class Problem1 {
    static void get(int n, int count){
        if(! (n<1)){
            count++;
        }else{
            count++;
            return;
        }
        get(n-1,count);
        get(n-3,count);
        // System.out.print(n+" "+count);
        System.out.println(count);
    }
    public static void main(String[] args) {
        int count=0;
        get(6, count);
    }
}
