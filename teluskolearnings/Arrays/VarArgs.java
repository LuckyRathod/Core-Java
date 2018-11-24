/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Arrays;

/**
 *
 * @author Lucky_Rathod
 */

class Display{
    
    public void show(int ... a){
        
        //   ... is varags which treats 'a' as an array 
        //Because when these method is called it doesnt matter how many args are passed all will be stored in these array 
        
        for(int i:a){
            
            System.out.println(i);
        }
        
        
    }
    
    public void show(int a){
        System.out.println(a + " special method show");
    }
}
public class VarArgs {
    
    public static void main(String[] args) {
        
        
        Display obj1 = new Display();
        obj1.show(5,6,7,8,9);
        
        
        //Now when we call these method which has one param and if that method is in class with one param 
        //then that method is called and not varags
        //Because method with same name,type and different args is called as Higher priority and varargs has lower priority
        obj1.show(5);
    }
    
}
