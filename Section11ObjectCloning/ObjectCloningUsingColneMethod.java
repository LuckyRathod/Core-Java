/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section11ObjectCloning;

/**
 *
 * @author Lucky_Rathod
 */
public class ObjectCloningUsingColneMethod  {
    
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //Now even if we do all part well 
        //we need to provide permission to clone object using Cloneable Interface
        
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;
        
        System.out.println(obj);
        
        //3rd type of copy is Clone method
        
        //clone method return Object type
        //So we need to typecaste to the object of class we want
        
        Abc obj1 = (Abc)obj.clone();
       //But clone method is not there
       //It is in Object class 
       //But it has protected Access specifier 
       //So what we can do is 
       //override that method in subclass of Object Class
       
        System.out.println("Cloning Method"+obj1);
    }
    
}

class Abc implements Cloneable
        
        //To provide permission to clone object we need to use Cloneable Interface
        //Cloneable Interface is Markable Interface 
        //Meaning that interface is empty
        //Basically it is used to provide permission
        // Markable Interface
        // Serializable and Cloneable
{
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc{" + "i=" + i + ", j=" + j + '}';
    }
    
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
        //the reason that i written super.clone() because we have to call that method indirectly
        //But it throws exception 
        //CloneNotSupportedException
    }
    
    
    
}
