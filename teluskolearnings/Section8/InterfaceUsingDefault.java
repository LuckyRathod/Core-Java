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

interface AExampleDefault{
    default public void  show(){
        System.out.println("in Show of interface a");
    }
}
interface BExampleDefault{
    default public void show(){
        System.out.println("in show of interface b");
    }
}
class C implements AExampleDefault,BExampleDefault{
    
    //If we define method in both interface then we neexd to override it in subclass
    public void show(){
        System.out.println("In c"); 
    }
  
 
    
   
    
}
   class ClassA{
        public void show(){
            System.out.println("IN class a");
        }
    }
 class InterfaceClasss extends ClassA implements AExampleDefault{
        public void display(){
            
        }
    }
public class InterfaceUsingDefault {
    public static void main(String[] args) {
          AExampleDefault a  =new C();
    a.show();
    BExampleDefault b = new C();
    b.show();
    C c = new C();
    c.show(); 
               InterfaceClasss ab = new InterfaceClasss();
           ab.show();
    
    
    }

}
