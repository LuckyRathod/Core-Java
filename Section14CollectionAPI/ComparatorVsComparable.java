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
import java.lang.Integer;

/**
 *
 * @author Lucky_Rathod
 */
public class ComparatorVsComparable {
    
    public static void main(String[] args) {
        
        //Comparator is used in 2 Situtions
        /*
        1. When u are using 3rd party Library class and u cant access it and it doesnt implement Comparable
           then u have to use Comparator
        
        
        2. When u have used Comparable but used it for only compsring ram of laptop 
           and now u want to also comapre price 
           then use Comparator for price
        
        
        3. All inbuilt classes Integer. String implements Comparable 
          So u can directly write 
          Collections.sort()
          But if you want to change the logic defined in compareTo () of Integer or String 
          then u cant do that you have to use Comparator Interfacce 
        
        
        
        */
        
        List<LaptopComparatorComparable> val = new ArrayList<>();
        val.add(new LaptopComparatorComparable("Dell", 4, 800));
        val.add(new LaptopComparatorComparable("Lenovo", 8, 1000));
        val.add(new LaptopComparatorComparable("Hp", 6, 900));
        
        //Now i have used Comparable Interface
        //So now i will get output of ram in ascending order
        System.out.println("Comparable Interface for RAM");
        Collections.sort(val);
        System.out.println(val);
        System.out.println("Comparator Interface when comparison not defined for price in Custom class");
            
        
        Comparator<LaptopComparatorComparable> com = new Comparator<LaptopComparatorComparable>(){
            @Override
            public int compare(LaptopComparatorComparable o1, LaptopComparatorComparable o2) {
                
                
                if(o1.getPrice() > o2.getPrice())
                    return 1;
                else
                    return 0;
            }
            
        };
//        Collections.sort(val,(l1,l2)-> {
//                
//                if(l1.getPrice() > l2.getPrice())
//                    return 1;
//                else
//                    return 0;
//                
//            });

        Collections.sort(val,com);
        
        System.out.println(val);
        
        
    }
    
}
 