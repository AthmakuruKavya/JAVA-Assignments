package Day5_Assessment;

import java.util.Scanner;

public class AvgPosNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking array elements from the user
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //calculating the avg of positive nums
        int sum = 0, count=0;
        for(int j=0; j<arr.length;j++){
            if(arr[j] > 0){
                sum += arr[j];
                count++;
            }
        }

        float avg = sum/count;
        System.out.println("Average of positive numbers: "+avg);
    
        sc.close();
    }

}
