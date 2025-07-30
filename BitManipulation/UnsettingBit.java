package BitManipulation;

public class UnsettingBit {
    public static void main(String[] args) {
        int n = 13;
        int pos = 3;
        int bit = ~(1<<(pos-1));
        int ans = n & bit;
        System.out.println(ans);
    }
}
