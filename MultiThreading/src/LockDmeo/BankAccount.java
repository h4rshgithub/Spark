package LockDmeo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 1000;
    private final ReentrantLock rl = new ReentrantLock();

    public void withdraw(String threadName  , int amt){
        System.out.println(threadName + " is trying to withdrwa "+ amt);
        rl.lock();
        try {
            System.out.println(threadName+ "aquired lock");
            if (balance >= amt) {
                balance -= amt;
                System.out.println("Withdrawn : " + amt + " Remaining : " + balance);

            } else {
                System.out.println("Insufficient Balance ");

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            rl.unlock();
        }


    }
}
