/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section7AfterArray;

/**
 *
 * @author Lucky_Rathod
 */
public class StaticExample {
    
    public static void main(String[] args) {
        
        //Now if show() is not static then we need o create an object of staticClassExampleDemo and then we can access show()
        //But if it is static then we dont have to create an object
        
        
        StaticClassExampleDemo.show();
        
        
        //Accessing static variable
        StaticClassExampleDemo.i = 5;
      
        
        
    }
    
}

class StaticClassExampleDemo{
    
    static int i ; 
    
    //Non satic varaible
    int j = 5;
    
    public static void show(){
        
        System.out.println("Method called without object Creation");
        
        //We cannot access non static varaible in static method
        
//        System.out.println(" "+j);  // -->Error  non static cannot be accessed in static 
        
    }
    
}
