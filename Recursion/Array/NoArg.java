package Recursion.Array;

import java.util.ArrayList;

public class NoArg {

    //returning an arrayList without passing it in the argument
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8};
        int target = 4;
        System.out.println(find(arr, target, 0));
    }
    static ArrayList<Integer> find(int[] arr, int target, int i){
        ArrayList<Integer> ans = new ArrayList<>();
        if(i==arr.length){
            return ans;
        }
        if(arr[i] == target){
            ans.add(i);
        }
        ArrayList<Integer> ansBelowCalls = find(arr, target, i+1);
        ans.addAll(ansBelowCalls);
        return ans;
    }
}
