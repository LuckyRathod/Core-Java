/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section10ExceptionHandling;

/**
 *
 * @author Lucky_Rathod
 */
public class ExceptionDemoUnchecked {
    
    public static void main(String[] args) {
        
        
        //Exception can be handled
        //Due to exception flow of execution goes on it cannot be stoped
        
        int i=8,j=0,k=0;  //Normal statement
        try{
        k = i/j;          //Critical statement
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Divide by zero error"); //Unchecked Exception
        }
        System.out.println(k);
        
    }
    
}
