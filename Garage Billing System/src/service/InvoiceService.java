package service;

import config.dbConfig;
import entity.Customer;
import entity.Invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
    public void addInvoice(Invoice invoice) throws SQLException {
        Connection con = dbConfig.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO invoices (customer_id , vehicle_id ,service_id) " +
                "VALUES (?,?,?)");
        ps.setInt(1, invoice.getCustomerId());
        ps.setInt(2, invoice.getVehicleId());
        ps.setInt(3, invoice.getServiceId());
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public List<Invoice> getAllInvoices() throws SQLException {
        List<Invoice> list = new ArrayList<>();
        Connection con = dbConfig.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT  * FROM invoices");
        while(rs.next()){
            list.add(new Invoice(rs.getInt("id") , rs.getInt("customer_id") ,
                    rs.getInt("vehicle_id") , rs.getInt("service_id")));

        }
        con.close();
        return  list;



    }
}
