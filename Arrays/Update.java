import java.util.Arrays;

public class Update {
    public static void main(String[] args) {
        int[] arr = {5,7,10,20,0,0};
        int index = 2;
        int ele = 9;
        for(int i=arr.length-1; i>=0; i--){
            if(i==index){
                arr[i]=ele;
                break;
            }
            arr[i] = arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
