import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // loads a Java class into memory using its fully qualified name
            // "com.mysql.cj.jdbc.Driver" is the MySQL JDBC driver's class nam

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent" , "root" , "root");
            //DriverManager is a built-in JDBC class that manages registered JDBC drivers and helps establish connections.
            // getConnection()  method attempts to connect Java with MySQL.
            System.out.println("DB connection established ");

             Statement statement = con.createStatement();
            String query = "select * from student";
            ResultSet rs = statement.executeQuery(query);
            //ResultSet is a JDBC interface that represents the data returned by a SELECT query.

            System.out.println("-------Read Data -------");
            while (rs.next()){
                System.out.println( rs.getInt("id") + " | " + rs.getString("stdName") + " | " + rs.getString("age"));

            }
        }catch (Exception e){
            e.getStackTrace();
        }





    }
}
