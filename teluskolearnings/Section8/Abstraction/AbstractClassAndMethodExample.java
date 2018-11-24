/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section8.Abstraction;

/**
 *
 * @author Lucky_Rathod
 */

abstract class MaheshPhone {
    
    public void call (){
        System.out.println("Calling");
    }
    
    //When methods are declared and  not defined its abstract
    //Now mahesh could not establish these featuresz
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{
    
    //Now all methods are virtually added
    //So all abstract methods are also added 
    //So we need to make these class as abstract
    //Now Ramesh could establish only one feature new 
    public void move(){
        System.out.println("Moving");
    }
    //dance and cook are still not defined
}
//Suresh comes and define those two methods 
//So now there are no abstact methods in class
//So need to make class  abstract
class SureshPhone extends RameshPhone{
    
    public void dance(){
        System.out.println("Dancing");
    }
    
    public void cook(){
        System.out.println("Cooking");
    }
}


public class AbstractClassAndMethodExample {
    public static void main(String[] args) {
          
            //  Now we cannot create an object of abstract class but we can create an instance of abstract class
            
      
    MaheshPhone obj = new SureshPhone();
    obj.call();
    obj.cook();
    obj.dance();
    obj.move();
       
            
    }

    
}
