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
public class LazyEvaluationExample {
    
    
    public static void main(String[] args) {
        
        
        /*
            In stream there are two types of Method
        --> Intermediate method
        --> Terminal method 
        
        
        //Intermediate method --> filter() , map()
        //Terminal methods    --> forEach(),findFirst()
     
        */
        List<Integer> values = Arrays.asList(12,60,20,12,50,70);
         System.out.println(values.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
         
         //Now here filter and map are Lazy Methods
         //Means when the work arrives to them they say that we are done with ouur work
         //Our pricessing is done
         //As soon as the Terminal method arrives 
         //They start doing  there work
         
         //Initially all are converted into stream values
         //which then filter() says done
         //map() says done
         
         //As soon as Terminal method arrives it will see that only First element is to be obtained
         
         //Sends ack to map that , one element is to be passed in Termina method 
         
         //Which then send ack to filter() that only first element is to obtained 
         //So it only iterated till first no is obtained 
         
         //and then pases to map and then to filter
         
         
         
         //Lazy methods are Like submitting assignmetns in 2days
         //1st day methods will say done done
         //At last result is to be showm, then only they start doing there work
        
    }
    
}
