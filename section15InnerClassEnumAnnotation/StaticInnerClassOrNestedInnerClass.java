/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section15InnerClassEnumAnnotation;

/**
 *
 * @author Lucky_Rathod
 */

class Aa{
    
    //When u declare a inner class as Static  u dont need an object of outer class
    
   static  class Bb{
        
        public void show(){
            System.out.println("Helloooo");
        }
    }
}
public class StaticInnerClassOrNestedInnerClass {
   
    
     //When u declare a inner class as Static  u dont need an object of outer class
    public static void main(String[] args) {
        
        
        Aa.Bb obj = new Aa.Bb();
        obj.show();
        
    }
}
