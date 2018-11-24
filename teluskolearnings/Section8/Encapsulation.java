/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section8;

/**
 *
 * @author Lucky_Rathod
 */

class A{
    
   private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
   
}
public class Encapsulation {
    
    public static void main(String[] args) {
            
    A obj = new A();
    //Now to access an object we have to create an object of class
//    obj.i = 5;
    //Now Encapsulation says that in order to change the value of an varaible you should use methods
    //1)Varaibles should be private 
    //2)Use of Getter and Setter methods
    
    obj.setI(5);
        System.out.println(obj.getI());
    
    
    }

    
}
