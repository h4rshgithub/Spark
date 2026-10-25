package Commun;

public class ThreadComm {
    static void main(String[] args) throws InterruptedException {
        ThreadA t1 = new ThreadA();
        ThreadA t2 = new ThreadA();
        System.out.println("Main thread started .....");
        t1.start();
        synchronized (t1){
            System.out.println("main thread calling wait....");
            t1.wait();
            System.out.println("Main thread get notified .....");
            System.out.println("Total : "+ t1.total  );

        }

    }
}
class ThreadA extends Thread{
    int total = 0 ;
    @Override
    public void run() {

        synchronized (this){
            System.out.println("child thread started calculation....");

            for(int i=0 ; i<= 100 ; i++){
                total += i ;
            }
            this.notify();
            System.out.println("child thread getting notification ");

        }
    }
}
