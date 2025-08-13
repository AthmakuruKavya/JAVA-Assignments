import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {7,10,4,3,6,5,2};
        int j = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>j){
                list.add(arr[i]);
                j = arr[i];
            }
        }
        for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }
}
