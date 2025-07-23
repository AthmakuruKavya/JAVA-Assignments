package Math;

public class Palindrome {
    public static void main(String[] args) {
        // int n = 123;
        // int temp = n;
        // int sum = 0;
        // while (n > 0) {
        //     int r = n % 10;
        //     sum = sum * 10 + r;
        //     n=n/10;
        // }
        // if(sum == temp){
        //     System.out.println(temp+" is palindrome");
        // }else{
        //     System.out.println(temp+" is not palindrome");
        // }

        String s ="12341";
        int si = 0;
        int ei = s.length()-1;
        // boolean res = true;
        // while(si <= ei){
        //     if(s.charAt(si) != s.charAt(ei)){
        //         System.out.println("Is not palindrome");
        //         res = false;
        //         break;
        //     }
        //     si++;
        //     ei--;
        // }
        // if(res){
        //     System.out.println("it is palindrome");
        // }

        while((s.charAt(si)==s.charAt(ei)) && si<=ei){
            si++;
            ei--;
            
        }
        System.out.println((si>ei)? "Is palindrome" : "Is not palindrome");

    }
}
