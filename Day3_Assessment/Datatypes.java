package Day3_Assessment;

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        byte byte_val = sc.nextByte();
        short short_val = sc.nextShort();
        int int_val = sc.nextInt();
        long long_val = sc.nextLong();
        float float_val = sc.nextFloat();
        double double_val = sc.nextDouble();

        System.out.println("Byte: "+byte_val+", Range: "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("Short: "+short_val+", Range: "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("Int: "+int_val+", Range: "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("Long: "+long_val+", Range: "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("Float: "+float_val+", Range: "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("Double: "+double_val+", Range: "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);

        sc.close();
    }
}
