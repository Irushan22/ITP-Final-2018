/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kushan_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kushan Ravindu
 */
public class dbConnect {
    public static Connection connect() throws ClassNotFoundException{
        Connection con = null;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpfinal", "root", "");
        }catch(SQLException e){
        System.out.println(e);
        }
        return con;
    }
}
