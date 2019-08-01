/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akitha_db;

import java.sql.*;
public class dblogin {
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
public Connection getConnection(){
    try {
        String url="jdbc:mysql://localhost:3306/itpfinal";
        String user="root";
        String password="";
        
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url, user, password);
    } catch (SQLException ex) {
        System.out.println("Error "+ex.getMessage());
    }
    catch(ClassNotFoundException ex){
        System.out.println("Error "+ex.getMessage());
    }
    finally{
        return conn;
    }
}
public ResultSet searchQuery(String sql){
    try {
        getConnection();
        st=conn.createStatement();
        rs=st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println("ERROR " +ex.getMessage());
    }
    return rs;
}
    
}
