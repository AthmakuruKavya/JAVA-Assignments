package Math;

public class Prime {
    public static void main(String[] args) {
        int n =2;
        boolean ans = false;
        if(n<=1){
            System.out.println(n+" Is not prime");
        }
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(n+" is not prime");
                ans=true;
                break;
            }
        }
        if(!ans){
            System.out.println(n+" is prime");
        }
    }
}
