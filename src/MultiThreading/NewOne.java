package MultiThreading;


class Yd implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            System.out.println("Yield Thread");
            // this will give the name of the thread
            // Thread.yield();

        }
    }
}

class Yd1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            System.out.println("main Thread");
            // this will give the name of the thread
            // Thread.yield();

        }
    }
}

public class NewOne {
    public static void main(String[] args) {
        Thread t = new Thread(new Yd());
        Thread t1 = new Thread(new Yd1());

        t.start();
        t1.start();
        for (int j = 0; j < 100; j++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("parent this Thread");
        }
    }

}

