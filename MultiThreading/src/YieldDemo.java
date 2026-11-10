class YieldThread extends Thread{
    @Override
    public void run() {
        for(int i=0 ; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+ "------"+i );
            Thread.yield();
        }
    }
}

public class YieldDemo {
    static void main(String[] args) {
        YieldThread t1 = new YieldThread();
        YieldThread t2 = new YieldThread();
        t1.start();
        t2.start();

    }
}
