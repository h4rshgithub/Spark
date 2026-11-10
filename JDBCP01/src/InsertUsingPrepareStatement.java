import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertUsingPrepareStatement {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // loads a Java class into memory using its fully qualified name
            // "com.mysql.cj.jdbc.Driver" is the MySQL JDBC driver's class nam

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent" , "root" , "root");
            //DriverManager is a built-in JDBC class that manages registered JDBC drivers and helps establish connections.
            // getConnection()  method attempts to connect Java with MySQL.
            System.out.println("DB connection established ");

            String query = "insert into student (id , stdName , age) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1 , 105);
            ps.setString(2 , "raj");
            ps.setInt(3 , 23);
            ps.executeUpdate();

            ps.setInt(1 , 106);
            ps.setString(2 , "Advika");
            ps.setInt(3 , 67);
            ps.executeUpdate();

            ps.setInt(1 , 107);
            ps.setString(2 , "Tanya");
            ps.setInt(3 , 25);
            ps.executeUpdate();
            //ResultSet is a JDBC interface that represents the data returned by a SELECT query.
            System.out.println("Inserted Multiple row ");


            con.close();


        }catch (Exception e){
            e.getStackTrace();
        }





    }
}
