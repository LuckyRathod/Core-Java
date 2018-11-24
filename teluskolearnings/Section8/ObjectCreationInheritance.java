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
        //super()   by default hidden
        System.out.println("In Y const");
    }
    
    public Y(int i){
        //super()    by default hidden
        System.out.println("In Y const int");
    }
}
public class ObjectCreationInheritance {
    
    public static void main(String[] args) {
            X obj = new X();
            X obj1 = new X(5);
            
            //Now when u  create an object of Subclass then 
            //there is hidden methods in subclass named as 'super'
            //'super'  --> Which calls the default constructor of parent class
             System.out.println("\nDefault constructor of parent is called both time below\n");
            Y obj2 = new Y();
           
            Y obj3 = new Y(5);
    
    }
    

    
    
}
