package BitManipulation;

import java.util.HashMap;

public class HashOdd {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,2,3};
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int cur_ele = arr[i];
            if(hash.containsKey(cur_ele)==true){
                int cur_val = hash.get(cur_ele);
                hash.put(cur_ele, cur_val+1);
            }else{
                hash.put(cur_ele, 1);
            }
        }
        System.out.println(hash);
        for(int e : hash.keySet()){
            if(hash.get(e)%2 != 0){
                System.out.println(e);
                break;
            }
        }
    }
}
