class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable.......");
    }
}



public class InterfaceDemo {
    static void main(String[] args) {
        Thread  t= new Thread(new MyTask());
    }
}
