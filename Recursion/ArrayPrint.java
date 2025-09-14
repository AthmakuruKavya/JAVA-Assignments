package Recursion;

public class ArrayPrint {
    static void print(int[] arr, int len){
        for(int i=len-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        print(arr, arr.length);
    }
}
