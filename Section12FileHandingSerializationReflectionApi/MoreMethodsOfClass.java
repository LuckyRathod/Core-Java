/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12FileHandingSerializationReflectionApi;

/**
 *
 * @author Lucky_Rathod
 */

class Abc{
    
}

class A extends Abc{
    
}
public class MoreMethodsOfClass {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class c = Class.forName("Section12FileHandingSerializationReflectionApi.A");
        System.out.println(c.isInterface());
        System.out.println(c.getSuperclass());
    }
    
}
