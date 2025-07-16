package Day5_Assessment;

import java.util.Arrays;
import java.util.Scanner;
//Assignment 8: Function + Array – Count How Many Are Divisible by 3

public class CountDivBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Count of numbers divisible by 3: "+count(arr));

        sc.close();
    }
    static int count(int[] arr){
        int count =0;
        for(int i=0; i<arr.length ;i++){
            if(arr[i]%3 == 0){
                count++;
            }
        }
        return count;
    }
}
