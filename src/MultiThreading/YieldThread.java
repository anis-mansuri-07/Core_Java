package MultiThreading;


class YieldDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.println(Thread.currentThread().getName() + " : " + i);
            System.out.println("Yield Thread");
            // this will give the name of the thread
            Thread.yield();

        }
    }
}

public class YieldThread {
    public static void main(String[] args) {

        Thread t = new Thread(new YieldDemo());
        t.start();
        for (int j = 0; j < 50; j++) {
            //  System.out.println(Thread.currentThread().getName());
            System.out.println("Main Thread");
        }
    }
}
