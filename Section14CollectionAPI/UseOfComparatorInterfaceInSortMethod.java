/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Lucky_Rathod
 */
public class UseOfComparatorInterfaceInSortMethod {
    
    public static void main(String[] args) {
        
        
    List<Integer> values = new ArrayList<>();
    values.add(305);
    values.add(998);
    values.add(774);
    values.add(236);
    values.add(881);
    
    
    //Now if we want to sort these we will use
    //Collections.sort(values);
    //But imagine  if we want to sort these by only considering the las digit 
    //Then in these sort() of Collection we have to add argument as Comparator Object
    
    //Default sort()using the sorting technique
    //In which these technique compare the two inputs
    //Now if we want to change the logic of Comparison 
    //We need to add Comparator object
    
    
   
    //Comparator is an interface , we cannot create an object of it so we need
    //Create a class that implements Comparator Interface
    
    
//    
//    Comparator<Integer> com = new ComparatorClass<Integer>();
//    //Now to sort as per last digit we will make o1 % 10 in compare() of Comparator Interface of ComparatorClass class 
//   
//    
//    Collections.sort(values,com);
//        System.out.println(values);


//Now we can make use of Anonymous class and Lambda expression if we dont want to ccreate a classs


//        Collections.sort(values,(o1,o2)->{
//            
//            //We dont have to specify any return type and Data type in Arguments part
//            
//            if(o1%10 > o2%10)
//                return 1;
//            return -1;
//            
//            //using ternary operator
////            return (o1%10>o2%10)?1:-1;
//            
//        });
//        
//        System.out.println(values);
        
        Collections.sort(values,new ComparatorClass<Integer>(){
                @Override
    public int compare(Integer o1, Integer o2) {
       if(o1%10 > o2%10)
           return 1;
       return -1;
    }
        });
        
        System.out.println(values);
    
    }
    

    
    
}
