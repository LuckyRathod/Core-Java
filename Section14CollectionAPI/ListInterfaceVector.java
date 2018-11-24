/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Lucky_Rathod
 */
public class ListInterfaceVector {
    
    public static void main(String[] args) {
        
        
        //Vector and ArrayList --> Dynamic array
        /*
        --> In increases capacity be 100 %    -->It increase capacity by 50 %
        i-e 10 , 20 , 40 etc
        
        --> Thread Safe                       -->Not thread safe
        --> It is slow                        --> It is fast
        --> Waste Memory                      --> Saves Memory
        
        */
        
        
        Vector v = new Vector();
        System.out.println(v.capacity());
        v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1); 
        System.out.println(v.capacity());
                v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);        v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);
        System.out.println(v.capacity());
         v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);        v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);
         v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);        v.add(1);
        v.add(1);
        v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);
        
        System.out.println(v.capacity());
        
        //Generics
        Vector<Integer> v1 = new Vector<>();
        v1.add(2);
        v1.add(3);
        v1.forEach(System.out::println);
        
        
        //Array List
        
        List<Integer> a = new ArrayList<>();
        System.out.println("Array List");
        System.out.println(a.size());
        a.add(1);
        a.add(2);
                a.add(1);
        a.add(2);
                a.add(1);
        a.add(2);
                a.add(1);
        a.add(2);        a.add(1);
        a.add(2);        a.add(1);
        a.add(2);
        
        
        System.out.println(a.size());
        
        
        
        
        
    }
    
}
