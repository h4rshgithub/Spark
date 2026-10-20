import java.util.*;

public class ThrowTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double b = sc.nextDouble();
        double  amt = sc.nextDouble();
        try{
            withdraw(b , amt);
        }catch(Exception e ){
            System.out.println("Error : " + e.toString());
        }finally {
            System.out.println("Thanks for using PNB ATM");
        }
    }
    public static void withdraw(double bal , double amt ) throws Exception{
        if( amt > bal){
            throw new Exception("balanace is not suffcient ");// create our own exception object using throw where throows is used to propgate or give exception to handle to it
            //parent class
        }else {
            System.out.println("Withdrwa done of amount = " + amt);
            System.out.println("Remaining =" + (bal - amt));
        }
    }
}
