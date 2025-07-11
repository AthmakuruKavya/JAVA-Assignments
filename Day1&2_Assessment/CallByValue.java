import java.util.Scanner;

public class CallByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Original value before function call: "+x);
        changeValue(x);
        System.out.println("Original value after function call: "+x);

        sc.close();
    }
    static void changeValue(int x){
        x = 100;
        System.out.println("Value inside function: "+x);
    }
}
