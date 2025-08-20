
public class EqPointArr {

    // Time Complexity = O(n)
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, -9, 20, 6 };
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        int ls = 0;
        for(int i=1; i<arr.length; i++){
            ls = ls+arr[i-1];
            left[i] = ls;
        }
        int rs = 0;
        for(int i=arr.length-2; i>=0; i--){
            rs = rs+arr[i+1];
            right[i] = rs;
        }
        for(int i=0; i<arr.length; i++){
            if(left[i] == right[i]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
