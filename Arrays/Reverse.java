import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {30,20,5};
        int si = 0;
        int ei = arr.length-1;
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
