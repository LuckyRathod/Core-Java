/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section17Java8Features;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lucky_Rathod
 */
public class ForEachMethodReference {
    
    public static void main(String[] args) {
        
        
        //Method Reference
        //Passing the method as Reference
        //These Featured was introduce in JAVA  1.8
        //To use it we have to use :: before method Name
        
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        
        //values.forEach(i -> System.out.println(i));
        //Now here mthod is taking i printing it
        //So why to write theses much
        //We will tell method which operation to do and method will do 
        //These is Functional programming
        System.out.println("Using println\n");
        values.forEach(System.out :: println);
        
        
        //Is println() only method that can be use in method referencing
        //We can use any method , even our own method
       
        System.out.println("Using our own method by i * 2 ");
        values.forEach(ForEachMethodReference :: ownMethodForReference);
        
    }
    public static void ownMethodForReference(int i){
        System.out.println(i*2);
    }
}
