// import java.util.Arrays;

public class Maxdiff {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4}; 
        int small = Integer.MAX_VALUE;
        int big = 0;
        int dif = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <small){
                small = nums[i];
                big = nums[i];
            }
            if(nums[i] > big){
                big = nums[i];
            }
            int val = big - small;
            if(val>dif){
                dif = val;
            }
        }
        System.out.println(dif);

        // int small = arr[0];
        // int big = arr[0];
        // int i=1;
        // int diff = 0;
        // while(i<arr.length){
        //     if(arr[i]<small){
        //         small= arr[i];
        //         big = arr[i];
        //     }
        //     if(arr[i]>big){
        //         big = arr[i];    
        //     }
        //     int val = big - small;
        //     if(val>diff){
        //         diff =val;
        //     }
        //     i++;
        // }
        
        
        
        //{10,20,30}; {2,3,10,6,4,8,1};
        // int n = arr.length;
        // int[] small  = new int[n];
        // int s = Integer.MAX_VALUE;
        // for(int i=0; i<n; i++){
        //     if(arr[i] < s){
        //         s = arr[i];
        //         small[i] = s;
        //     }else{
        //         small[i] = s;
        //     }
        // }
        // int[] big = new int[n];
        // int b = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i] > b){
        //         b = arr[i];
        //         big[i] = b;
        //     }else{
        //         big[i] = b;
        //     }
        // }
        // System.out.println(Arrays.toString(small));
        // System.out.println(Arrays.toString(big));


        




         //{10,20,30};  
        // int max = 0;
        // int maxindex = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //         maxindex = i;
        //     }
        // }
        // int diff = 0;
        // for(int i=0; i<maxindex; i++){
        //     int value = max - arr[i];
        //     if(value >diff){
        //         diff = value;
        //     }
        // }
        // System.out.println(diff);




        // int diff = 0;
        // int indexi = 0;
        // int indexj = 0;
        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=i+1; j<arr.length;j++){
        //         int value = arr[j] - arr[i];
        //         if(value > diff){
        //             diff = value;
        //             indexi = i;
        //             indexj = j;
        //         }
        //     }
        // }
        //System.out.println(diff+" "+ indexj+" "+indexi);
    }
}
