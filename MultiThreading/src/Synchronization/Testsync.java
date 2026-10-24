package Synchronization;

public class Testsync {
    static void main(String[] args) {
        PrintTable t = new PrintTable();
        MyThread1 t1 = new MyThread1(t);
        MyThread1 t2 = new MyThread1(t);
        t1.setName("t1-thread--");
        t2.setName("t2-thread--");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch ( InterruptedException e ){
            e.printStackTrace();
        }

    }
}
