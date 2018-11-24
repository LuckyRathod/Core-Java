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

/*
 7 Steps
-> import the package
-> Load and Register the Driver
-> Establish the Connection
-> Create the Statement
-> Execute the query
-> Process results
-> close conn and stmt
*/

import java.sql.*;

public class JavaDatabaseConnectivityExample {

        public static void main(String[] args) throws Exception {
        
            //Load and Register the Driver
            //Netbeans inbuilt 
            //Eclipse -> mysql connector jar file shoult be stored in Library folder 
            
            //Register the Driver
            
            //forName will throw Checked Exception
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Establish the Conection
            
            //Connection is Interface 
            //getConnection will provide an object which is DriverManager Class
            //Three parameters URL , USERNAME , PASSWORD
            
            
            //studenttelusko is database name
            String url= "jdbc:mysql://localhost:3306/studenttelusko";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url,uname,pass);
            
            //Create Statement
            
            //Statement is also an interface
            Statement st = con.createStatement();
            
            //Execute the query
            String query = "select userName from student where userid = 1";
            //you will get the data
            ResultSet rs = st.executeQuery(query);
            
            //Process the Result
            while(rs.next()){
                
                //In rs.getString() --> you can specify Column no or Column name
                System.out.println(rs.getString(1));  
            }
            
            System.out.println("\n Second query for fetching all values");
            String query1 = "select * from student";
            ResultSet rs1 = st.executeQuery(query1);
            
            while(rs1.next()){
                System.out.println(rs1.getInt(1)+" : "+rs1.getString(2));
            }
            //Close connnection
            st.close();
            con.close();
            
    }
}
