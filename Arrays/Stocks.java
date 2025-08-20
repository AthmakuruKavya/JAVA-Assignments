public class Stocks {
    public static void main(String[] args) {
        int[] stocks = {1,5,3,8,12};
        int profit = 0;
        for(int i=0; i<stocks.length-1; i++){
            int val = stocks[i+1]-stocks[i];
            if(val>0){
                profit = val+profit;
            }
        }
        System.out.println(profit);
    }
}
