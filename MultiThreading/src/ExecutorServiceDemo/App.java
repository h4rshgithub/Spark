package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(8);
        String stdList[] = {"Riya" , "raj " , "Harsh" , "tanishq" , "Nikita" , "Rohit" , "Divya", "Sagar" , "Anju "};
        for(String str : stdList){
            CertificationSender task = new CertificationSender(str);
            service.submit(task);

        }
        service.shutdown();
    }
}
