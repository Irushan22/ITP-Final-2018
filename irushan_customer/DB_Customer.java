
package irushan_customer;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Akila
 */
public class DB_Customer {
    
		public static Connection connect()
                {        
		Connection conn = null;
                
		{
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		 conn= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/itpfinal","root","");
	
                }
                catch(Exception e)
		{
                    System.out.println(e);
			
			}  
		return conn;
		}  
		}  
}
