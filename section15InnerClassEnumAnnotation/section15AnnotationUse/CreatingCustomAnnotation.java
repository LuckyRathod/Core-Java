/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section15InnerClassEnumAnnotation.section15AnnotationUse;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Lucky_Rathod
 */

    //Create your own Annotation
    //Two annotaion are neccessary if you create your own
    //Target    AND Retention

    @Target(ElementType.TYPE) //Till what level you will be using Annotation ->CLASS , METHOD , INTERFACE ,TYPE(CLASS AND INTERFACE)
    @Retention(RetentionPolicy.RUNTIME) //Till what point u need these interface
    
    
    //Annotation with one field is SIngle value Annotation
    //Annotation with Multi field is Multi Value Annotation
    //Annotation with no field is Markable Annotation
    @interface SmartPhoneAndroid{
        
        
        //Annotation have methode 
        //so BELOW are all methods
        
        String os() default "Windows";
        int version() default 1;
        
        
    }
    //Now if u want to assign the field value the
    @SmartPhoneAndroid(os="Android",version=6)
    class NokiaASeries{
        
        String model;
        int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
        
        
        
    }
public class CreatingCustomAnnotation {
    
    
    public static void main(String[] args) {
        
        NokiaASeries a = new NokiaASeries("Fire",5);
        System.out.println(a.model);
        //Now i want to acces Annotation field also 
        //And print os and version 
        
        Class c = a.getClass();
        //Annotation an = c.getAnnotation(SmartPhoneAndroid.class);
        SmartPhoneAndroid s = (SmartPhoneAndroid)an;
        System.out.println(s.os());
        System.out.println(s.version());
    }
}
