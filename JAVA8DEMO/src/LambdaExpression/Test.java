package LambdaExpression;

public class Test {
    static void main(String[] args) {
//        ThreadB t = new ThreadB();
//        t.start();
        Runnable task =() -> {
            System.out.println("Hello ");
        };
        new Thread(task ).start(); 
        for(int i =0 ; i< 5 ; i++){
            System.out.println("Main ");
        }
    }
}
