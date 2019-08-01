/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akila_interfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AKILA
 */
public class DbConnect {
    public static Connection connect(){
        
        Connection conn = null;
        
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/distributiondb","root","");
            
        }
        catch(ClassNotFoundException | SQLException e)
                {
                    System.out.println(e);
        }
        return conn;
    }
}
