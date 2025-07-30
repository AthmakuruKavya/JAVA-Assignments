package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 4;
        int bit = 1<<(pos-1);
        int ans = n|bit;
        System.out.println(ans);
    }
}
