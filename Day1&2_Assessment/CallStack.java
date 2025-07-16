public class CallStack {
    public static void main(String[] args) {
        System.out.println("Main started");
        firstStep();
        System.out.println("Main ended");
    }
    static void firstStep(){
        System.out.println("First Step started");
        secondStep();
        System.out.println("First Step ended");
    }
    static void secondStep(){
        System.out.println("Second Step Started");
        System.out.println("Second Step ended");

    }
}
