package Day4_Assessment;

//Signed vs Unsigned Right Shift

public class RightShiftOP {
    public static void main(String[] args) {
        int num = -8;
        System.out.println("Signed (-8 >> 2): "+ (num >> 2));
        System.out.println("Unsigned (-8 >>> 2): "+ (num >>> 2));
    }
}
