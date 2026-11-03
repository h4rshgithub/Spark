package service;

import entity.Invoice;

import java.sql.SQLException;
import java.util.List;

public class BillingService {
    private final CustomerService customerService = new CustomerService();
    private final InvoiceService invoiceService = new InvoiceService();

    public void createInvoice(int customerid , int vehicleid , List<Integer> serviceIds) throws SQLException {
        String sids="";
        for(int serviceID : serviceIds){
            sids += serviceID;
        }
        invoiceService.addInvoice(new Invoice(0 , customerid , vehicleid , Integer.parseInt(sids)));
        System.out.println("Invoice Created Successfully");
        System.out.println(invoiceService);
    }
    public void showAllInvoices() throws SQLException {
        List<Invoice> list = invoiceService.getAllInvoices();
        for(Invoice i : list){
            System.out.println(i);
        }
    }


}
