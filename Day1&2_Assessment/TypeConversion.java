
import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        float num2 = sc.nextFloat();
        sc.nextLine();
        String num3 = sc.next();

        System.out.println("Int to float:"+(float)num);
        System.out.println("Float to Int:"+(int)num2);
        System.out.println("String to Int:"+Integer.parseInt(num3));

        sc.close();
    }

}
