package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while(true){
            int num = sc.nextInt();
            if(num<0){
                break;
            }
            al.add(num);
        }
        System.out.println(al);
        int si = 0;
        int ei = al.size()-1;
        while(si<=ei){
            int temp = al.get(si);
            al.set(si, al.get(ei));
            al.set(ei, temp);
            si++;
            ei--;
        }
        System.out.println(al);
        sc.close();
    }
}
