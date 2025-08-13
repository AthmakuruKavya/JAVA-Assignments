import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int count = 1;
        while(count <= k){
            int temp = arr[arr.length-1];
            for(int i = arr.length-1; i>=1; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
