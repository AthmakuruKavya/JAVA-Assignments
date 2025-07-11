package Day5_Assessment;

import java.util.Scanner;

//Find the largest element in the array and determine if it's odd or even.

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //finding max in the array
        int max =0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] > max){
                max =arr[j];
            }
        }

        System.out.println("Maximum element: "+max);

        //checking the max is +ve num or -ve num
        if(max%2 ==0){
            System.out.println("It's an even number");
        }else{
            System.out.println("It's an odd number");
        }

        sc.close();
    }
}
