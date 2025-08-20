public class Kadens {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int ms = 0;
        int cs = 0;
        for(int i=0; i<arr.length; i++){
            cs = cs+arr[i];
            if(cs>ms){
                ms = cs;
            }
            if(cs<0){
                cs = 0;
            }
        }
        System.out.println(ms);
    }
}
