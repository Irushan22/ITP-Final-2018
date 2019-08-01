package nipun;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp pc
 */
public class codexDBConnect {
   
    
    
    public static Connection connect()
   {
    Connection conn = null;
    
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itpfinal","root","");
    } 
    catch(Exception e)
    {
       System.out.println(e); 
    }
    
    return conn;
    
   
   
   }
    
}
