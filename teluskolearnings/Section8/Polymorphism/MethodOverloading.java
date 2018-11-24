/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section8.Polymorphism;

/**
 *
 * @author Lucky_Rathod
 */

//Method overloading , Early Binding , Static Binding , Compile time polymorphism

class A{
    
    
    public void show(){
        System.out.println("In show method");
    }
    
    //Method with same name , different no of arguments and differeny type of arguments is called Method overloading
    
    public void show(int i){
        
        System.out.println("In show int ");
    }
    
    public void show(double d){
        System.out.println("In show double");
    }
}
public class MethodOverloading { 
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        obj.show(5);
        obj.show(5.5);
    }
    
}
