package LockDmeo;

public class Driver {
    static void main() {
        BankAccount b = new BankAccount();
        Runnable t1 = ()-> b.withdraw("wife" , 10000);;
        Runnable t2 = () -> b.withdraw("Mom" , 500);
        new Thread(t1).start();
        new Thread(t2).start();

    }
}
