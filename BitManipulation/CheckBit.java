package BitManipulation;

public class CheckBit {
    public static void main(String[] args) {
        int x =5;
        int pos = 3;
        int bit = 1<<(pos-1);
        String ans = ((x&bit) != 0)? "On" : "Off";
        System.out.println(ans);
    }
}
