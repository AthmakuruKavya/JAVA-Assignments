import java.util.ArrayList;

public class RemDup {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int j = i-1;
            boolean ans = true;
            while(j>=0){
                if(arr[j] == arr[i]){
                    ans = false;
                }
                j--;
            }
            if(ans){
                al.add(arr[i]);
            }
        }
        System.out.println(al);
    }
}
