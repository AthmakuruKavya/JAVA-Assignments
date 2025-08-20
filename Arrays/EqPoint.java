public class EqPoint {

    //Time complexity : O(n^2)
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, -9, 20, 6 };
        int p = 0;
        int element = -1;
        while (p < arr.length) {
            int val1 = 0;
            for (int si = 0; si < p; si++) {
                val1 = val1 + arr[si];
            }
            int val2 = 0;
            for (int ei = p + 1; ei < arr.length; ei++) {
                val2 = val2 + arr[ei];
                if (val2 > val1) {
                    break;
                }
            }
            if (val1 == val2){
                element = arr[p];
            }
            p++;
        }
        System.out.println(element);
    }
}
