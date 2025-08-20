public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int val = 0;
                for(int si=i; si<=j; si++){
                    val = val+arr[si];
                }
                if(val>sum){
                    sum = val;
                }
            }
        }
        System.out.println(sum);
    }
}
