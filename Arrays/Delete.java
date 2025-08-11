import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 7 };
        int ele = 4;
        // int val = 0;
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                // val = i;
                res = true;
                // break;
            }
            if ((res) && (i != arr.length - 1)) {
                arr[i] = arr[i + 1];
            }
        }
        // for(int i=val; i<arr.length-1; i++){
        // arr[i] = arr[i+1];
        // }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
