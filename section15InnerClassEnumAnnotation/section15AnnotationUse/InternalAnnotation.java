/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section15InnerClassEnumAnnotation.section15AnnotationUse;

import java.util.ArrayList;

/**
 *
 * @author Lucky_Rathod
 */

class A{
        public void showDatabase(){
            
        }
    }
    class B extends A
    {
        
        @Override
        //So now if you dont write proper name then error
        //example showdatabase()
        public void showDatabase(){
            
        }
        
        
        @Deprecated
        public void show(){
            
        }
    }


    @FunctionalInterface
            
            //When u write one more method it will give error at compile time
            //Because Functional interface only has one method
    interface Demo{
        public void demo();
        
    }
public class InternalAnnotation {
    
    /*
    
    Internal Annotations
    @Override
    @SuppressWarnings("unchecked");
    @Deprecated
    @FunctionalInterface
    */
    
    
    public static void main(String[] args) {
        
        
        //SupressWarning
        
        
        //Now here it will give you warning of Generics
        
        @SuppressWarnings("unchecked")
        ArrayList a = new ArrayList();
        
        
        
        //Deprecated
        //Means its not recommmended to use 
        //it is available
        B obj = new B();
        
        //Deprecated method
        obj.show();
        
        
        //Functional interface example shown above
        
        
        
    }
    
}
