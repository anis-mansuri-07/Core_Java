package MultiThreading;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread());
            System.out.println("Parent " + i);
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr); //this is how we can create thread using Runnable interface
        //Thread t2 = new Thread(new MyRunnable());   //we can also write this
        t.setName("Anis"); // you can set the name of the thread by passing String into that thread using setName() Method
        t.start();


        for (int j = 0; j < 20; j++) {
            System.out.println(Thread.currentThread());
            System.out.println("Child " + j);
        }
    }
}