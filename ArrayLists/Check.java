package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while(true){
            System.out.print("Enter a value: ");
            int num = sc.nextInt();
            if(num<0){
                break;
            }else if(al.contains(num)){
                continue;
            }else{
                al.add(num);
            }
        }
        sc.close();
        System.out.println(al);
    }
}
