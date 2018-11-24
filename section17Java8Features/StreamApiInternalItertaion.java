/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section17Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Lucky_Rathod
 */
public class StreamApiInternalItertaion {
    
    public static void main(String[] args) {
        
        List<Integer> values = Arrays.asList(1,2,3,4,5)
                ;
        
        //Now to print we have three methods 
        // for loop
        //Enhanced for loop 
        //Iterator
        
        /*
        All above methods are External iteration
        Now we will use Internal Iteration
        
        External Iterator iterates elements sequentially
        Internal Iterator does not have to iterates elements sequentially
        
        External Iterator iterates elements one by one
        Internal Iterator iterates elements individaully as well as in bulk
        
        Programmer controls iteration of elements
        Internal iterator controls the iteration itself
        //Here programmer tells the iterator about what programs to be performed
        
        */
        System.out.println("\nExternal Iterations");
        System.out.println("\nFor loop");
        for(int i=0;i<values.size();i++)
            System.out.println(i);
        System.out.println("\nEnhanced for loop");
        for(int a : values)
            System.out.println(a);
        System.out.println("\nIterator");
        Iterator i = values.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("\nInternal Iterations");
        
        System.out.println("\nAnonymous class");
        
        values.forEach(new Consumer<Integer>(){
                            public void accept(Integer i){
                                System.out.println(i);
                            }
                        });
        
        System.out.println("\nUsing Lambda");
        
       values.forEach(j -> System.out.println(j));
        
    }
    
}
