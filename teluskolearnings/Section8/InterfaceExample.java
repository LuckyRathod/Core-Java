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
interface Abc{
    public abstract void show();
}

class AbcImplement implements Abc{
    
    public void show(){
        System.out.println("In show");
    }
    
    public void display(){
        System.out.println("In Display");
    }
}
public class InterfaceExample {
    
    public static void main(String[] args) {
           Abc obj = new AbcImplement();
           //Now we want to call method decalred in interface 
           //For which we have to create an object of class that implemented it
    obj.show();
    
    //Error
   // obj.display();   // You cannot call display method because it is not declared in interface
    
   
   //Calling a method declared in interface without defining it in class
   //These can be done by using Lambda expression [ Java 8 feature ] 
   
   //Now we only have one method in interface therefore we wrote like these 
   //Means we didnt write method name show () and directly started writting its implementation
    Abc obj1 = () -> System.out.println("In show");
    obj1.show();
    
    }
 
}
