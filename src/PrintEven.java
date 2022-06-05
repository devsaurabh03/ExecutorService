class PrintEven implements Runnable {

    private PrintEvenOddMonitor monitor;

    public PrintEven(PrintEvenOddMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {

        synchronized (monitor) {
            while (true) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                monitor.startOdd = true;
                System.out.println("Even");
                monitor.notify();
            }
        }
    }
}
