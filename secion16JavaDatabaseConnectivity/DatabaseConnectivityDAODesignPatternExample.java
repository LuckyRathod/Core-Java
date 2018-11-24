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

//Model object or value OBJECT
class Student 
{
    int userid;
    String userName;
    
    
}
class StudentDAO
{
    public Student getStudent(int userid)throws Exception
    {
        Student s = new Student();
        s.userid = userid;
        
        //Now we will fetch the name of the student whose userid is 1
         Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/studenttelusko";
        String uname = "root";
        String pwd="";
        Connection con = DriverManager.getConnection(url,uname,pwd);
        
        //Prepare statement is only used in DML
        // OR Else you have to use Statement
        
        Statement st = con.createStatement();
        String query = "Select userName from student where userid = "+userid+"";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            String userName = rs.getString(1);
            s.userName = userName;
        }
        
        return s;
    }
    
    
    public void addStudent(Student s)throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/studenttelusko";
        String uname = "root";
        String pwd="";
        Connection con = DriverManager.getConnection(url,uname,pwd);
        
        //Now while inserting we will use PreparedStatement
        String query1 = "insert into student values(?,?)";
        PreparedStatement ps = con.prepareStatement(query1);
        ps.setInt(1,s.userid);
        ps.setString(2,s.userName);
        
        int count = ps.executeUpdate();
        System.out.println(count+ " no of rows affected");
        ps.close();
        con.close();
    }
}
public class DatabaseConnectivityDAODesignPatternExample {
    
    /*
    
    DAO -> Data Access Objects
    
    It is an object / Interface which is used to access data or to store data to or from database
    It abstracts the retreival and updation of data 
    
    Three main parts
    -> Model object or value object
        Simple POJO class containing getter and setter methods for all columns of table in database
    
    -> Data Access Object interface
       Its an interface which contains all the methods which will be used in DAO Concrete class
    
    -> Data Access Object Concrete class
        Implements interface
        Contains all methods which will be defined of declared methods of interface
    */
    
    
    public static void main(String[] args) throws Exception {
        
        
        StudentDAO dao = new StudentDAO();
        Student s = dao.getStudent(4);
        System.out.println(s.userName);
        Student s2 = new Student();
        s2.userid = 5;
        s2.userName = "Yahvi";
        dao.addStudent(s2);
    }
}
