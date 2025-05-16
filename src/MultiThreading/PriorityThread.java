package MultiThreading;

// Normal Priority Of Thread Is 5
class P_Thread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}

public class PriorityThread {
    public static void main(String[] args) {
        Thread t = new Thread(new P_Thread(), "Thread One"); // Class with name
        Thread t2 = new Thread(new P_Thread(), "Thread Two"); // only Class
        System.out.println("Priority Of T: " + t.getPriority());
        //t2.setPriority(10);
        // t.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority Of T2: " + t2.getPriority());
        System.out.println("Priority Of T: " + t.getPriority());
        t.start();
        //t2.start();
        for (int j = 0; j < 50; j++) {
            System.out.println("Thread.currentThread()");
        }


    }
}
