package Recursion.Array;

import java.util.ArrayList;

public class DupIndices {

     // returning arraylist of indices found in the attay that contains the target

    public static void main(String[] args) {
        int[] arr = {3,2,1,4,4,8};
        int target = 4;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(findIndices(arr, target, 0, ans));
    }
    static ArrayList<Integer> findIndices(int[] arr, int target, int index, ArrayList<Integer> ans){
        if(index == arr.length){
            return ans;
        }
        if(arr[index] == target){
            ans.add(index);
        }
        return findIndices(arr, target, index+1, ans);
    }
}
