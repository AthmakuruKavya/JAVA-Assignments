import java.util.Arrays;

public class EvenOddSort2 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int i=0;
        int j=1;
        call(arr, i, j);
        // while(j<arr.length){
        //     if(arr[i]%2==0){
        //         i++;
        //         j++;
        //     }else{
        //         if(arr[j]%2 == 0){
        //             swap(arr,i,j);
        //             i++;
        //             j++;
        //         }else{
        //             j++;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
    }
    static void call(int[] arr, int i, int j){
        if(j==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(arr[i]%2==0){
            call(arr, i+1, j+1);
        }else{
            if(arr[j]%2==0){
                swap(arr,i,j);
                call(arr, i+1, j+1);
            }
            else{
                call(arr, i, j+1);
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
