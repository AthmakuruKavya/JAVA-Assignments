package BitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n =  43261596;
        System.out.println(revBits(n));

    }
    static int revBits(int n){
        String binaryNum = Integer.toBinaryString(n);
        int bits = 32-binaryNum.length();
        String bitsZ = "0".repeat(bits);
        String binaryStr = bitsZ+binaryNum;
        String rev = "";
        for(int i = binaryStr.length()-1; i>=0; i--){
            rev += binaryStr.charAt(i);
        }
        int num = Integer.parseInt(rev,2);
        System.out.println(num);

        return 0;
    }
}
