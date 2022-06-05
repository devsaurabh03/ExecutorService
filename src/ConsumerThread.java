import java.util.ArrayList;

public class ConsumerThread implements Runnable{
    ArrayList list;

    public ConsumerThread(ArrayList list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                while (list.size() <= 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                list.remove(list.indexOf(5));
                System.out.println("Consumed");
                list.notify();
            }
        }
    }

}
