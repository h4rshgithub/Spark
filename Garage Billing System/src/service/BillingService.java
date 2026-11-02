package service;

import entity.Invoice;

import java.sql.SQLException;
import java.util.List;

public class BillingService {
    private final CustomerService customerService = new CustomerService();
    private final InvoiceService invoiceService = new InvoiceService();

    public void createInvoice(int customerid , int vehicleid , List<Integer> serviceIds) throws SQLException {
        for(int serviceID : serviceIds){
            invoiceService.addInvoice(new Invoice(0 , customerid , vehicleid , serviceID));
        }
        System.out.println("Invoice Created Successfully");
    }
    public void showAllInvoices() throws SQLException {
        List<Invoice> list = invoiceService.getAllInvoices();
        for(Invoice i : list){
            System.out.println(i);
        }
    }


}
