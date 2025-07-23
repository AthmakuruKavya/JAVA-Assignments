package Math;

public class Factorial {
    public static void main(String[] args) {
        int n =5;
        int pro =1;
        while(n>1){
            pro=pro*n;
            n--;
        }
        System.out.println(pro);
    }
}
