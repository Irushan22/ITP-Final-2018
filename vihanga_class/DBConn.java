/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vihanga_class;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vihanga
 */

public class DBConn {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpfinal","root","");
        } 
        
        catch (Exception e) 
        {
            System.out.println(e);
            
        }
        
        return conn;
    
    }
    
}
