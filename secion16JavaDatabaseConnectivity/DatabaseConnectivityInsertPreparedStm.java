/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secion16JavaDatabaseConnectivity;

/**
 *
 * @author Lucky_Rathod
 */
import java.sql.*;
public class DatabaseConnectivityInsertPreparedStm {
    
    public static void main(String[] args) throws Exception {
      
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/studenttelusko";
        String uname = "root";
        String pwd="";
        Connection con = DriverManager.getConnection(url,uname,pwd);
        
        //Prepare statement will be use because we dont know the value it will be dynmaic 
        //Whereas quesry will be fixed
        //So when u have fixed query but have different value PreparedStatement is used
        
        String query = "insert into student values(?,?)";
        //When u dont know that what will be your values then use ?
        int val = 4;
        String userName = "Prakshal";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,val);
        ps.setString(2, userName);
        
        
        //Now if it is DML then executeUpdate is ussed
        int count = ps.executeUpdate();
        
        System.out.println(count+" no of rows affected");
        
        ps.close();
        con.close();
        
        
    }
    
}
