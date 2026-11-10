package Synchronization;

public class PrintTable {
    public synchronized void printtable(int n ){
        for(int i =1 ; i<6 ; i++){
            System.out.println(Thread.currentThread().getName()+ " --> "+ n *i );
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());

            }
        }
    }

}
