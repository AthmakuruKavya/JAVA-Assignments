public class PrefixSum {
    public static void main(String[] args) {
        int[] nums = {2,8,3,9,6,5,4};
        System.out.println(getSum(0, 2, nums));
    }
    static int getSum(int s, int e, int[] nums){
        int sum = 0;
        for(int i=s; i<=e; i++){
            sum += nums[i];
        }
        return sum;
    }
}
