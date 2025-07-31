package BitManipulation;

// import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 4;
        int pow = 5;
        int sum = 0;
        while(n>0){
            int val = n&1;
            if(val!=0){
                sum = sum+val*pow;
            }
            pow= pow*5;
            n = n>>1;
        }
        System.out.println(sum);
        // sc.close();
    }
}
