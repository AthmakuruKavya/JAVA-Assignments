
import java.util.*;
class UserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        float cgpa = sc.nextFloat();

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("CGPA:"+cgpa);

        sc.close();

    }
}