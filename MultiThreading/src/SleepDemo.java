class Sleepmethod extends Thread{
    @Override
    public void run() {
        for(int i =0 ; i<=5 ; i++){
            System.out.println(getName()+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread intruppeted");
            }
        }
    }
}

public class SleepDemo {
    static void main(String[] args) {
        Sleepmethod t1 = new Sleepmethod();
        t1.setName("child--->");
        t1.start();
    }
}
