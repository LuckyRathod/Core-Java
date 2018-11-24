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
class Exam
{
    static 
    {
        System.out.println("In static block");
    }
    {
        System.out.println("In intance block");
    }
}
public class ForNameExample {
    
    public static void main(String[] args) throws Exception {
        
        
        //It only executed static block of class
        
        Class.forName("secion16JavaDatabaseConnectivity.Exam");
        
        //To execute instance block
        Class.forName("secion16JavaDatabaseConnectivity.Exam").newInstance();
    }
}
