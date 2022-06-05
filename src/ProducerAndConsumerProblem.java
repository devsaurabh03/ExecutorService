import java.util.ArrayList;

public class ProducerAndConsumerProblem {

    public static void main(String args[]){
        ArrayList list = new ArrayList(5);

        Thread t1 = new Thread(new ProducerThread(list));
        Thread t2 = new Thread(new ConsumerThread(list));

        t1.start();
        t2.start();

    }

}
