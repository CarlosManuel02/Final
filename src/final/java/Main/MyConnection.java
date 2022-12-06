package Main;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Carlos
 */
public class MyConnection {


    public static Connection getConnectionFinal() {

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final", "root", "noway123");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

}


    
    

