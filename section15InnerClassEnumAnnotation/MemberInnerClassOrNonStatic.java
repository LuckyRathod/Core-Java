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

class A {
    
    
    class B{
        
        public void show(){
            System.out.println("Hello");
        }
    }
}
public class MemberInnerClassOrNonStatic {
    
    public static void main(String[] args) {
        
        
        //Now to access the show method of inner class B
        //We need an object of Class A in member inner class
        
        A obj = new A();
        A.B obj1 = obj.new B();
        obj1.show();
        
        //Now hence B is a inner class 
        //After compiling it will create 
        //A$B.class file
    }
    
}
