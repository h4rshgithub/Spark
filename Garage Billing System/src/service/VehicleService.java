package service;

import config.dbConfig;
import entity.Customer;

import java.sql.*;

public class VehicleService {
    public static void addVehicle(Customer customer ,String numberPlate , String model) throws SQLException {
        Connection con = dbConfig.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO vehicles (customer_id , number_plate ,model) values (?,?,?)");
        ps.setInt(1, customer.getId());
        ps.setString(2, numberPlate);
        ps.setString(3, model);
        ps.executeUpdate();
        System.out.println("\nCustomer with Vehicle registered successfully!");

        // Print customer details
        System.out.println("\nCustomer Details:");
        System.out.println(customer);

        PreparedStatement ps2 = con.prepareStatement("SELECT * FROM vehicles WHERE number_plate = ?");
        ps2.setString(1, numberPlate);
        ResultSet rs = ps2.executeQuery();

        while(rs.next()){
            System.out.println("Vehicle id :" +rs.getInt("id") + " | Customer id : " +
                    rs.getInt("customer_id") + " | Vehicle number : " + rs.getString("number_plate") + " |  Model : " + rs.getString("model"));

        }
        rs.close();
        ps2.close();
        ps.close();
        con.close();

    }
}
