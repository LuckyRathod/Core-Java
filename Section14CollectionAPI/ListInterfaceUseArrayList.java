/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucky_Rathod
 */
public class ListInterfaceUseArrayList {
    
    public static void main(String[] args) {
        
        //Collection doesnt works well with index no
        //Meaning we cannot  add elements in between 
        //We cannot sort Collection object using Collections.sort
        
        
        //List overcomes these advantage of inserting element in between
        List<Integer> values = new ArrayList<>();
        
        values.add(10);
        values.add(30);
        values.add(40);
        values.add(50);
        
        //Inserting element in  between
        values.add(1,20);
        
        values.forEach(System.out :: println);
        
        
        //Contains
        System.out.println(values.contains(10));
        
        System.out.println(values.lastIndexOf(30));
        
        
        //Will replace the 20 with 15
        System.out.println(values.set(1, 15));
        
        System.out.println("kkk");
        values.forEach(System.out::println);
        
        List<Integer> v = values.subList(2, 4);
        System.out.println("hhh");
        v.forEach(System.out::println);
       
        
    }
    
}
