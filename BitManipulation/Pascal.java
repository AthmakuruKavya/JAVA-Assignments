package BitManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((generate(n)));
        sc.close();
    }
    static List<Integer> firstRow(){
       
            List<Integer> al = new ArrayList<>();
            al.add(1);
            return al;
     
    }
    static List<Integer> normalRow(int n){
        int val = 1;
        List<Integer> al = new ArrayList<>();
        al.add(1);
        int num=n;
        int den=1;
        for(int i=1;i<=n;i++){
            val = val*num/den;
            al.add(val);
            num--;
            den++;
        }
        return al;
    }
    static List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList<>();
       for(int i=0;i<numRows;i++){
          List<Integer> a ;
          if(i==0){
             a = firstRow();
          }
          else{
            a = normalRow(i);
          }
          result.add(a);
       }

       return result;
    }
}
