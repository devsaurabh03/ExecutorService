class PrintOdd implements Runnable{


    private PrintEvenOddMonitor monitor;

    public PrintOdd(PrintEvenOddMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {

        synchronized(monitor){
            while (monitor.startOdd) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Odd");
                monitor.notify();
            }
        }
    }
}
