package Recursion.Array;

public class ArraySort {

    //checking whether the array is sorted or not using recursion
    public static void main(String[] args) {
        int[] arr = {1,8,3,4};
        System.out.println(sort(arr,0));
    }
    static boolean sort(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1])&& sort(arr,index+1);
    }
}
