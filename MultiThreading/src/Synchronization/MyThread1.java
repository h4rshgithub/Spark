package Synchronization;

public class MyThread1 extends  Thread{
    PrintTable t = new PrintTable();
    MyThread1(PrintTable t){
        this.t = t ;
    }

    @Override
    public void run() {
        t.printtable(5);
    }
}
