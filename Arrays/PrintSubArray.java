

public class PrintSubArray {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int sum = 33;
        int si = 0;
        int ei = 0;
        int val = 0;
        boolean ans = false;
        while(si<arr.length && ei<arr.length){
            if(val<sum){
                val =val+arr[ei];
                ei++;
            }else if(val>sum){
                val = 0;
                si++;
                ei = si;
            }else{
                ans = true;
                break;
            }
        }
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        


        // boolean ans = false;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i; j<arr.length; j++){
        //         int val = 0;
        //         for(int index=i; index<=j; index++){
        //             val = val+arr[index];
        //             if(val == sum){
        //                 ans = true;
        //                 break;
        //             }
        //         }
        //     }
        // }
        // if(ans){
        //     System.out.println("YES");
        // }else{
        //     System.out.println("NO");
        // }
    }
}
