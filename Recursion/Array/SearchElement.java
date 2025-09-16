package Recursion.Array;

public class SearchElement {

    //searching an element in the array
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 10;
        System.out.println(search(arr,target,0));
    }
    static int search(int[] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return search(arr, target, i+1);
    }
}
