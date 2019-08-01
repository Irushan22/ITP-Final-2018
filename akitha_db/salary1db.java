/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akitha_db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Akitha N Iddamalgoda
 */
public class salary1db {
    public static Connection connect(){
    Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","" );
        } catch (Exception e) {
            System.out.println(e);
        }
    
    return conn;
}
    
}
