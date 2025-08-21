public class Frequencies {
    public static void main(String[] args) {
        int[] nums = {10,20,20,30,30,30};
        boolean[] arr = new boolean[nums.length];
        for(int i=0; i<nums.length;i++){
            int count = 0;
            if(arr[i] != true){
                for(int j=0; j<nums.length; j++){
                    if(nums[i] == nums[j]){
                        count++;
                        arr[j] = true;
                    }
                    // System.out.println(Arrays.toString(arr));
                }
                System.out.println(nums[i] + " -> "+count);
            }
        }
    }
}
