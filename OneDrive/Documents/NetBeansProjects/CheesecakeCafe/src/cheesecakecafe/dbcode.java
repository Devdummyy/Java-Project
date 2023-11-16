package cheesecakecafe;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class dbcode {
    public static Connection mycon1(){
        Connection con = null;
        try { 
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Data_member","postgres","142088");
            System.err.println("Loading Successfull");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dbcode.class.getName()).log(Level.SEVERE, null, ex);         
            System.err.println("Loading Failed");
        }
            return con;
     
    }

    
}
