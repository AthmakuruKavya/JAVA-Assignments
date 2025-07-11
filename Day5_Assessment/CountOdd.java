package Day5_Assessment;

import java.util.Scanner;

//Assignment 2: Count and Print Odd Numbers (while loop + if condition)

public class CountOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Odd numbers: ");
        int j=0,count = 0;
        while(j<arr.length){
            if (arr[j]%2 != 0) {
                System.out.print(arr[j]+" ");
                count++;
            }
            j++;
        }
        System.out.println();
        System.out.println("Count: "+count);
    
        sc.close();
    }

}
