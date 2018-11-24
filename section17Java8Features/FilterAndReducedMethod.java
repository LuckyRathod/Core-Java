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
public class FilterAndReducedMethod {
    
    
    public static void main(String[] args) {
        
        
        /*
        Filter is used when u have some condition to filter the list of values
        
        //Only want nos divisible by 5 from List
        
        filter() -> Needs object of Predicate Interface 
                    It is Functional Interface 
                    whhich has method 
                    Return Boolean s
                    public Boolean test(Integer i){
                                return i * 5 ;
                         }
        
         Filter will take 1st value from list 
          checks whether divisible by 5 
          If not then it removes from the list means Filter is done of nos divisible by 5
        */
        
        
        List<Integer> values = Arrays.asList(10,2,3,40,5,6);
        
        values.stream().filter(i -> i%5 == 0).forEach(System.out::println);
        
        System.out.println(values.stream().filter(i -> i%5 == 0).reduce(Integer::sum));
        
    }
    
}
