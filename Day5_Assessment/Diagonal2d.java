package Day5_Assessment;

import java.util.Scanner;

public class Diagonal2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //Printing diagonal elements
        System.out.print("Diagonal elements: ");
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

        sc.close();

    }
}
