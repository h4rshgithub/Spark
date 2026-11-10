package service;

import config.dbConfig;
import entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static void addCustomer(Customer customer) throws SQLException {
        Connection con = dbConfig.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO customer (name, phone) VALUES (?,?)",
                Statement.RETURN_GENERATED_KEYS
        );
         ps.setString(1, customer.getName());
         ps.setString(2, customer.getPhone());
         ps.executeUpdate();
         ps.close();
         con.close();

    }

    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> list = new ArrayList<>();
        Connection con = dbConfig.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT  * FROM customer");
        while(rs.next()){
            list.add(new Customer(rs.getInt("id") , rs.getString("name") , rs.getString("phone")));

        }
        con.close();
        return  list;



    }
    public static  Customer getCustomerBasedOnPhone(String number) throws SQLException {
        Customer customer = new Customer();

        Connection con = dbConfig.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT  * FROM customer where phone = "+number );
        while(rs.next()){
             customer = new Customer(rs.getInt("id") , rs.getString("name") , rs.getString("phone"));

        }
        con.close();
        return  customer;
    }
}
