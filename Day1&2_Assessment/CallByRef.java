import java.util.Arrays;

public class CallByRef {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Before function call: "+Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After function call: "+Arrays.toString(arr));

    }
    static void modifyArray(int[] arr){
        arr[0] = 99;
        System.out.println("Inside function: "+Arrays.toString(arr));
    }
}
