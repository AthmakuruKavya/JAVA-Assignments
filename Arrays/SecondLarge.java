public class SecondLarge {
    public static void main(String[] args) {
        int[] arr = { 10, 10, 10 };
        int first = -1;
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        System.out.println(second);

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > first) {
        // first = arr[i];
        // }
        // }
        // for(int i=0; i<arr.length; i++){
        // if(arr[i]>second && arr[i]!=first){
        // second = arr[i];
        // }
        // }
        // System.out.println(second);

    }
}
