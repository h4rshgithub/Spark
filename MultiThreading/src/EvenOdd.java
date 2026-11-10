class Even extends Thread{
    @Override
    public void run() {
        for(int i =2 ; i< 10 ; i= i+2){
            System.out.println("Even : " + i );
        }
    }
}
class Odd extends Thread{
    @Override
    public void run() {
        for(int i =1 ; i< 10 ; i= i+2){
            System.out.println("Odd  : " + i );
        }
    }
}

public class EvenOdd {
    static void main(String[] args) {
        new Even().start();
        new Odd().start();
//        Even e = new Even();
//        e.start();
    }
}
