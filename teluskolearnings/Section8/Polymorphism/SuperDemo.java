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

class X{
    public X(){
        
        System.out.println("In X const");
    }
    
    public X(int i){
        
        System.out.println("In X const int");
    }
}
class Y extends X{
    public Y(){
        
        System.out.println("In Y const");
    }
    
    public Y(int i){
        super(i);
        System.out.println("In Y const int");
    }
}
public class SuperDemo {
    
    public static void main(String[] args) {
        
        
         X obj = new X();
            X obj1 = new X(5);
            
            //Now when u  create an object of Subclass then 
            //there is hidden methods in subclass named as 'super'
            //'super'  --> Which calls the default constructor of parent class
             System.out.println("\nDefault constructor of parent is called below\n");
            Y obj2 = new Y();
           
            
            System.out.println("\nParameterized constructor of parent is called below\n");
            
            //Now if we specify parameters in super()
            //Then it will find param constructor in Superclass
            Y obj3 = new Y(5);
    }
}
