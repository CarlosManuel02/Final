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

//    public static Connection getConection() {
//
//        Connection con = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/alma", "root", "noway123");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return con;
//    }

    public Connection getconnection() {

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final", "root", "noway123");
        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return con;
    }

}   


    
    

