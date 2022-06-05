import java.util.ArrayList;

public class ProducerThread implements Runnable{

    ArrayList list;

    public ProducerThread(ArrayList list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (list) {
                while (list.size() >= 5) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                list.notify();
                list.add(5);
                System.out.println("Produced");

            }
        }
    }
}
