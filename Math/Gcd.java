package Math;

public class Gcd {
    public static void main(String[] args) {
        //eucledian Algorithm
        int a=4;
        int b=6;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println(a);
    }
}
