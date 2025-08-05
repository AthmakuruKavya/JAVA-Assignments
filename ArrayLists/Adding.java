package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<5; i++){
            al.add(sc.nextInt());
        }
        int j=al.size()-1;
        for(int i=0;i<arr.length;i++){
            arr[i] = al.get(j);
            j--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
