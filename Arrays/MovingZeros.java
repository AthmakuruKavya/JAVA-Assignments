import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 0){
                for(int j=i+1; j<arr.length;j++){
                    if(arr[j] != 0){
                        swap(i,j,arr);
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
