package Day5_Assessment;

import java.util.Scanner;

///Assignment 1: Sum of Even Elements in Array (for loop + condition)

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;
        for(int j=0; j<arr.length;j++){
            if( arr[j]%2 ==0){
                sum+=arr[j];
            }
        }

        System.out.println("Sum of even elements: "+sum);

        sc.close();

    }
}

    

