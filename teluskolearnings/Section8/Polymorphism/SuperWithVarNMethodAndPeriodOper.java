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

class SuperPart2{
    
    int i=5;
    public void show(){
        System.out.println("In super show method ");
    }
    
}

class SuperSubPart2 extends SuperPart2{
    
    public void showVar(){
        //Here we will be accessing super class i variable
        System.out.println(super.i);
    }
    public void show(){
        super.show(); //We can print method of Super class even if there is Method overrriding
        System.out.println("In sub show method");
    }
}
public class SuperWithVarNMethodAndPeriodOper {
    
    
    public static void main(String[] args) {
        
        SuperSubPart2 obj = new SuperSubPart2();
        obj.showVar();
        obj.show();
        
    }
    
}
