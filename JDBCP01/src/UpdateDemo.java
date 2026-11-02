import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // loads a Java class into memory using its fully qualified name
            // "com.mysql.cj.jdbc.Driver" is the MySQL JDBC driver's class name

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent" , "root" , "root");
            //DriverManager is a built-in JDBC class that manages registered JDBC drivers and helps establish connections.
            // getConnection()  method attempts to connect Java with MySQL.
            System.out.println("DB connection established ");

            Statement statement = con.createStatement();
            String query = "UPDATE student set age =88 where id = 101";
            int update  = statement.executeUpdate(query);
            //ResultSet is a JDBC interface that represents the data returned by a SELECT query.
            System.out.println("Updated  "+ update + " row ");


        }catch (Exception e){
            e.getStackTrace();
        }





    }
}
