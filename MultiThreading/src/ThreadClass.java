class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


public class ThreadClass {
    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = Thread.currentThread();
        t1.setName("Mera main thread...");
        System.out.println(t1.getName());
        MyThread1 m1 = new MyThread1();
        System.out.println(m1.getName());
        m1.setName("Child Thread....");
        m1.start();


    }
}
