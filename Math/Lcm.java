package Math;

public class Lcm {
    public static void main(String[] args) {
        int a=4;
        int b=6;
        int i=1;
        int val=0;
        boolean res = true;
        while(res){
            val = b*i;
            if(val%a==0){
                res=false;
            }
            i++;
        }
        System.out.println(val);
    }
}
