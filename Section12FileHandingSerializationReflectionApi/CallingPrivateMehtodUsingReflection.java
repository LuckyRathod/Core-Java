/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12FileHandingSerializationReflectionApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import Section12FileHandingSerializationReflectionApi.TestDemoRefelection;
/**
 *
 * @author Lucky_Rathod
 */
public class CallingPrivateMehtodUsingReflection {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        
        
        Class c = Class.forName("Section12FileHandingSerializationReflectionApi.TestDemoRefelection");
        
        TestDemoRefelection t = (TestDemoRefelection) c.newInstance();
        
        //To call private method we will create an object of Mehtod class
        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(t, null);
        
    }
    
}
