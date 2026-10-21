class JoinThread extends Thread{
    @Override
    public void run() {
        for (int i =0 ; i< 6 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread");
        }
    }
}
public class JoinDemo {
    static void main(String[] args) throws InterruptedException {
        JoinThread t1 = new JoinThread();
        t1.start();
        t1.join(); // main jo line excute krega wahi wait krega
        for(int i=0 ; i<6 ; i++){
            System.out.println("main Thread");
        }
    }
}
