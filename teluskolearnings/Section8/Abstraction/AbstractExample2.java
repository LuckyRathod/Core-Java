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

abstract class Phone{
    public abstract void call();
}
class Iphone extends Phone{
    public void call(){
        System.out.println("Calling Iphone");
    }
}
class Samsung extends Phone{
    public void call(){
        System.out.println("Calling Samsung");
    }
}
public class AbstractExample2 {
    
    public static void main(String[] args) {
        
//        Iphone obj = new Iphone();
//        Samsung obj1 = new Samsung();
//        repair(obj);
//        repair(obj1);
        Phone obj = new Iphone();
        Phone obj1 = new Samsung();
        obj.call();
        obj1.call();
      
    }
      public static void repair(Phone p){
            p.call();
        }
    
}
