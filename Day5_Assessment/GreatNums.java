package Day5_Assessment;

import java.util.Scanner;

//Assignment 4: Print Only Elements Greater Than a Given Number

public class GreatNums {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();

        //taking array elements from the user
        System.out.print("Array :");
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Printing the numbers greater then the given number
        System.out.print("Elements greater than "+x+": ");
        for(int j=0; j<arr.length;j++){
            if(arr[j] > x){
                System.out.print(arr[j]+" ");
            }
        }

        sc.close();
    }
}
