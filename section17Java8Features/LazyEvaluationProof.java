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
public class LazyEvaluationProof {
    
    public static void main(String[] args) {
        
    List<Integer> values = Arrays.asList(12,60,20,12,50,70);
    
    
    //Now here we will be using method reference
       
     System.out.println(values.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
     
     
          System.out.println(values.stream()
                                        .filter(LazyEvaluationProof::isDivisible)
                                        .map(LazyEvaluationProof::mapDouble).findFirst().orElse(0));
    
    
    }//Now here the filter method will only be itrerated till the first value is Obtained
    //filter and map are Lazy only do work when terminal methods are invoked
    
    public static Boolean isDivisible(int i){
        System.out.println("in isDivisible"+i);
        return i%5==0;
    }
    
    public static int mapDouble(int i){
        System.out.println("in mapDouble");
        return i*2;
    }
    
}
