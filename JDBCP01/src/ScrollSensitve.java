import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollSensitve {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent" , "root" , "root");
            System.out.println("Connection established DB");
            Statement statement = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY);
            String query = "select all * from student";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("------Scroll Insesitive , Read Only ------");

            rs.last();
            System.out.println( "Last row " + rs.getInt("id") );
            System.out.println("Last row "+ rs.getString("stdName"));

            rs.first();
            System.out.println( "Last row " + rs.getInt("id") );
            System.out.println("Last row "+ rs.getString("stdName"));

            rs.absolute(2);
            System.out.println( "Last row " + rs.getInt("id") );
            System.out.println("Last row "+ rs.getString("stdName"));



//          rs
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
