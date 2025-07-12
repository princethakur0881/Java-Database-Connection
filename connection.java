import java.sql.Connection;
import java.sql.DriverManager;


public class connection{
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "rimpal@123");
            System.out.println("Connection Successfull ");
            System.out.println("Connection address id  is" + con);
            System.out.println("Hello Database ");
        }
        catch (Exception e){

        }
    }
}