package Math;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        int n= 17;
        int count =0;
        boolean[] arr = new boolean[n];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2;i<n; i++){
            if(arr[i] == true){
                count++;
                for(int j=i*2; j<n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        System.out.println(count);
        // System.out.println(Arrays.toString(arr));
    }
}
