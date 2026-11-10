import entity.Customer;
import service.BillingService;
import service.CustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        BillingService billingService = new BillingService();
        while (true){
            System.out.println(" 1. Add Customer with vehicle  \n 2. Generate ivoice \n 3. Show invoice \n 4. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.print("Customer name : ");
                    String name = sc.next();
                    System.out.print("Customer Phone no. : ");
                    String phone = sc.next();
                    service.CustomerService.addCustomer(new Customer(0 , name , phone));
                    System.out.print("Enter Vehicle  Number : ");
                    String number = sc.next();
                    System.out.print("Enter Vehicle  Model : ");
                    String model = sc.next();
                    Customer customerBasedonNum = service.CustomerService.getCustomerBasedOnPhone(phone);
                    service.VehicleService.addVehicle(customerBasedonNum , number , model);



                    break;
                case 2 :
                    System.out.print("Enter customer id : ");
                    int cid = sc.nextInt();
                    System.out.print("Enter Vehicle id : ");
                    int vid = sc.nextInt();
                    System.out.print("Enter no of services : ");
                    int n = sc.nextInt();
                    List<Integer> sids = new ArrayList<>();
                    for (int i =0 ; i< n ; i++){
                        sids.add(sc.nextInt());
                    }
                    billingService.createInvoice(cid , vid , sids);
                    break;

                case 3 :
                    billingService.showAllInvoices();
                    break;
                case 4 :
                    System.exit(0);
                default:
                    System.out.println("Not a valid choice");
            }
        }


    }
}
