public class Problem {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
            if(i == arr.length-1){
                System.out.print(arr[i]+".");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
}
