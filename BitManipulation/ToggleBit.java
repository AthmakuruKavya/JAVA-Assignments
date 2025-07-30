package BitManipulation;

public class ToggleBit {
    public static void main(String[] args) {
        int x = 7;
        int pos = 4;
        int bit = 1 << (pos-1);
        int ans = x | bit;
        System.out.println(ans);
    }
}
