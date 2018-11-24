/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lucky_Rathod
 */
public class PrintDuplicateElementsINArrayList {
    
    public static void main(String[] args) {
       List<String> val = new ArrayList<>();
        val.add("Lucky");
        val.add("Jigar");
        val.add("Aditya");
        
        
        val.forEach(System.out::println);
        
        //But now if i add Lucky once again then it will have duplicate values in arraylisst
        
        val.add("Lucky");
        val.add("Jigar");
        System.out.println("\nDuplicate values in ArrayList");
        val.forEach(System.out::println);
        
        //Now we only want to print the Duplicate values
        //We know that Set contains unique elements'
        //And if we try to add elements of Duplicate by using add() 
        //Then add() return false
        
        Set<String> s = new HashSet<>();
        
        
        for(String inse : val){
            if(s.add(inse) == false)   //First it will add elements in Set then it will go for condition
            {
                System.out.println("\nDuplicate values ");
                System.out.println(inse);
            }
//            else
//            s.add(inse);
        }
        System.out.println("\nAdd method will return false if u try to add duplicate value in Set");
        System.out.println(s.add("Prerak"));
        System.out.println(s.add("Lucky"));
     
        System.out.println("\nSet Conents");
        s.forEach(System.out::println);
        
        System.out.println("\nArrayList contents");
        val.forEach(System.out::println);
       
    }
    
}
