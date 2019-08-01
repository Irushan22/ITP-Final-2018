/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isuru;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class rebuildDB {

    public static Connection connect() 
    {
        Connection conR = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conR = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itpfinal", "root", "");
        
        }
        catch(Exception e){
            System.out.println(e);
        }
       return conR;
        }
    }
   