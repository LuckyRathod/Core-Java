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

    class Bbb{
        
        public void show(){
            
            System.out.println("In Bbb class ");
        }
    }
public class AnonymousInnerClass {
    
    //Its mostly used with interface where only methods are declared 
    //For definnig u need to create a class that implements instead u can use 
    //Anonymous class
    
    
    public static void main(String[] args) {
        
        Bbb b = new Bbb()
        {
            
            //Now here we have created Anonymmous class without name 
            
            //So when Anonymlous class is used 
            
            //File of that class is also created 
            //here 
            //AnonymousInnerClass$1.class
            
         public void show(){
             System.out.println("In Anonymous class");
         }   
        };
        b.show();
    }
    

    
}


