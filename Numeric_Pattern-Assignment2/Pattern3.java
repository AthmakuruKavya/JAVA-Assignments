public class Pattern3 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            // Print first set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            int sp = 2 * (n - i);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            // Print second set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
