package Math;

public class CountDigit {
    public static void main(String[] args) {
        int n = 123;        int c =0;
        while(n>0){
            c++;
            n=n/10;
        }
        System.out.println(c);


        // reversing a number

        // c=c-1;
        // int sum =0;
        // while(temp>0){
        //     int r = temp%10;
        //     int val = (int)Math.pow(10, c);
        //     // System.out.println(val*r);
        //     sum = sum + (val*r);
        //     c--;
        //     temp = temp/10;
        // }
        // System.out.println(sum);
        int num = 25;
        System.out.println("0"+num);
    }
}
