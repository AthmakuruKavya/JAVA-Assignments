package Assessment4;

import java.util.Scanner;

//Function with Parameters & No Return Type

public class WithP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        printTable(num);
        sc.close();

    }
    static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.print(n*i +" ");
        }

    }
    
}
