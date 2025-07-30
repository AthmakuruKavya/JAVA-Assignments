package BitManipulation;

public class Power {
    public static void main(String[] args) {
        int pro=1;
        int base = 5;
        int exp = 3;
        // while(exp > 0){
        //     if((exp&1) != 0){
        //         pro = pro*base;
        //     }
        //     base = base*base;
        //     exp = exp >> 1;
        // }
        // System.out.println(pro);

        for(int i=1;i<=exp; i++){
            pro = pro*base;
        }
        System.out.println(pro);
    }
}
