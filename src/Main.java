public class Main {

    public static void main(String args[]){

        PrintEvenOddMonitor monitor = new PrintEvenOddMonitor();
        Thread t1 = new Thread(new PrintEven(monitor));
        Thread t2 = new Thread(new PrintOdd(monitor));

        t1.start();
        t2.start();

    }

}
