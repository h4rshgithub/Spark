class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}


public class PriorityThreadDemo {
    static void main(String[] args) {
        MyThread2 m1 = new MyThread2();
        m1.setName("Thread m1 ....");
        m1.setPriority(Thread.MIN_PRIORITY);
        m1.start();


        MyThread2 m2 = new MyThread2();
        m2.setName("Thread m2 .....");
        m2.setPriority(Thread.MAX_PRIORITY);
        m2.start();
    }
}
