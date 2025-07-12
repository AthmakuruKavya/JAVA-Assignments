package Day4_Assessment;

public class Loop {
    public static void main(String[] args) {
        
        int i=1;
        while(i<=10){
            if(i == 6){
                System.out.print("Loop stopped at "+i);
                break;
            }
            System.out.print(i+" ");
            i++;
        }
    }
}
