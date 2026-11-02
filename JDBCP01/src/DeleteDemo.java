import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent" , "root" , "root");
            System.out.println("Connection established DB");
            Statement statement = cn.createStatement();
            String query = "Delete from student where id = 101 ";
            int delete = statement.executeUpdate(query);
            System.out.println("Deleted " + delete+ " row");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

