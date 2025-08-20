public class EqPointSum {
    public static void main(String[] args) {
        int[] arr = { 1,2,0,3 };
        int rs = 0;
        for(int i=0; i<arr.length; i++){
            rs+=arr[i];
        }
        int ls = 0;
        for(int i=0; i<arr.length; i++){
            rs = rs - arr[i];
            if(rs == ls){
                System.out.println(arr[i]);
                break;
            }else{
                ls=ls+arr[i];
            }
        }
    }
}
