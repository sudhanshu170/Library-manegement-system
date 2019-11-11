/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nEW u
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb(){
        try
        {
            Class.forName("org.sqlite.JDBC");
 Connection conn;
            conn = DriverManager.getConnection("jdbc.sqllite:C:\\Users\\nEW u\\Documents\\NetBeansProjects\\Library manegement system\\LibraryNew.sqlite");
                    return conn;
                    
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        
        }
    }
    
}
