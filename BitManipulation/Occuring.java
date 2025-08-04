package BitManipulation;


public class Occuring {
    public static void main(String[] args) {
        // int[] arr = {8,7,7,5,6,6,8,8};
        // int num =0;
        // for(int i=0; i<arr.length; i++){
        //     int count = 0;
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[i] == arr[j]){ 
        //             count++;
        //         }
        //     }
        //     if(((count%2) != 0)){
        //         System.out.print(arr[i]+" ");
        //         arr[i]=0;
        //     }
        // }


        // int fe = 0;
        // int se = 0;
        // for(int i=0; i<arr.length; i++){
        //     int count = 0;
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[i] == arr[j]){ 
        //             count++;
        //         }
        //     }
        //     if((count%2) != 0){
        //         if(fe!=0 && fe!=arr[i]){
        //             se = arr[i];
        //         }else{
        //             fe = arr[i];
        //         }
        //     }
        // }
        // System.out.println(fe+" "+se);

        int[] arr = {1,1,1,5,5,5};
        int num = 0;
        for(int i=0; i<arr.length; i++){
            num = num^arr[i];
        }
        int val =0;
        for(int i=0; i<arr.length; i++){
            int dif = num-arr[i];
            if(((dif&(dif-1))==0) && dif!=0){
                val = dif;
            }
        }
        System.out.println(val);

        
        



    }
}
