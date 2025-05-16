package MultiThreading;

class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.println(Thread.currentThread());
            System.out.println("Thread");
        }

    }
}

class ThreadTest1 {

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        tt.start();
        for (int i = 0; i < 5; i++) {
            // System.out.println(Thread.currentThread()); // this gives the output which classes thread is running
            System.out.println(i);
          
        }

    }
}
