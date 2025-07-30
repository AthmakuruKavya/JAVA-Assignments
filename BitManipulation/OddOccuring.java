package BitManipulation;

public class OddOccuring {
    public static void main(String[] args) {
        int[] arr = {4,3,4,4,4,5,5};
        int val = 0;
        for(int i=0; i<arr.length; i++){
            val = val^arr[i];
        }
        System.out.println(val);
    }
}
