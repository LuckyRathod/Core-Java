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
public class UserDefinedException {
    
    public static void main(String[] args){
        
        
        //throws is used to surpress the error 
        //it will not handle
        
        //throw is used to forcefully throw an error
        int i = 5;
        try{
//        if(i<10){
//            throw new Exception("Error from Exception not user defined");
//        }
        
        if(i < 15 ){
          throw new MyException("User Defiend Exception");
          //throw new MyException();
        }
        }catch(MyException e){
          System.out.println(e);
         //System.out.println("eroorrrr");
        }
//        catch(Exception e){
//            System.out.println("Number less then 10");
//        }
    }
    
}
 class MyException extends Exception{
    
    public MyException(String msg){
       super(msg);
   }
    
}
