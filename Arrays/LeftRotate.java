import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int temp = 0;
        for (int i = 0; i <arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));

        // int i=0;
        // while(i<arr.length-1){
        //     temp = arr[i];
        //     arr[i] = arr[i+1];
        //     arr[i+1] = temp;
        //     i++;
        // }
        // System.out.println(Arrays.toString(arr));
    }
}
