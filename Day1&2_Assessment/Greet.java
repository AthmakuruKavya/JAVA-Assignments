// package Assessment1;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        greetUser(name);

        sc.close();
    }

    static void greetUser(String name){
        System.out.println("Hello "+name+", welcome to the MERN + DSA batch!");
    }
}
