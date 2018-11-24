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

class OverrideA{
    
    public void show(){
        System.out.println("In parent class");
    }
    
}

class OverrideB extends  OverrideA{
    
    //Now here show method gets virtually added because we extended OverrideA
    //Now when we write same method name with same type,same args,same name in subclass
    //Then it is called as Method Overriding
    
    public void show(){
        System.out.println("In sub class ");
    }
}
public class MethodOverriding { //Method Overrrideing , Late Binding , Dynamic Binding , Run time polymorphism
    
    
    public static void main(String[] args) {
        
        OverrideB obj = new OverrideB();
        
       obj.show();
    }
}
