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
public class StreamAndMapMethod {
    
    public static void main(String[] args) {
        
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        
        //Now we will will multiply each value of list by 2 and add all the values
        
        //Traditional way
        System.out.println("Traditonal way");
        int result = 0;
        for(Integer i:values){
            result = result + (i*2);
        }
        System.out.println(result);
        
        //Now by above method Mutation is achived meaning result values is getting updated 7 times
    
        //So to avoid mutataion stream api can be used here
        
        System.out.println("\nFunctional Programming Using Stream Api");
        System.out.println(values.stream()
                                 .map(i -> i*2)
                                 .reduce(0,(i,j) -> i+j));
        
        /*
        
            Now to use map reduce and filter methods we need Stream Interface object
            which is provided by stream()
                
            stream() -> will convert the values into stream values
            
            map() -> It is used to map each value 
                    
                     which requires OBJECT of Function Interface
                     Function Interface is a Functional interface
                        
                    which has apply(Integer i) method 
        
            reduce() ->It is used to perform operations on mapped values 
                       Operations such as Add,sub,div .....
        
                       It has 2 Parameters 
                       -> Initial value 
                       -> Object of BinaryOperator Interface 
                       
                       BinaryOperator Interface is a Functional interface
                       But it has all defined methods
                       No methods are declared in it 
        
                       It extends BiFunction Interface which is Functional interface
                       which has apply() method
        
                       (i,j) are parameters of apply method
                      
                       0+i -> i
                                  --> i+j
                        
        */
    
        
        System.out.println("\nDirectly using sum method of Integer class in reduce");
         System.out.println(values.stream()
                                 .map(i -> i*2)
                                 .reduce(0,(i,j) -> Integer.sum(i,j)));
         
                                 /////OR/////
        //Using method reference feature of JAVA 8
        
        System.out.println("\nUsing Method reference feature for Integer.sum");
        System.out.println(values.stream()
                                 .map(i -> i*2)
                                 .reduce(0,Integer::sum));
        
       
        System.out.println("\nOnly printing values for map");
             values.stream()
                        .map(i -> i*2).forEach(System.out::println);
                                 
                                
    }
    
}
