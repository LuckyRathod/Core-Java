/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lucky_Rathod
 */
public class SetInterfaceExample {
    
    
    public static void main(String[] args) {
        
        
        //Set interface is used when u dont want duplicate values
        //It doesnt have dupllicate values
        //Sequence of elements changes  everytime
        //Because HashMap is used which uses Hashing
        //So what hashing does is when u put values then it gets stored in certain locations 
        //And using one algorithm it will fetch the value which is at nearest to it first
        
        
        Set<Integer> val = new HashSet<>();
        val.add(5);
        val.add(10);
        val.add(20);
        val.add(80);
        val.add(5);
        val.add(80);
        
        val.forEach(System.out :: println);
        
        
        Set<Integer> vals = new TreeSet<>(Collections.reverseOrder());
        vals.add(40);
        vals.add(90);
        vals.add(10);
        vals.add(2);
        vals.add(90);
        vals.add(2);
        
        System.out.println();
        System.out.println("Use of TreeSet");
        
        vals.forEach(System.out::println);
       
        
        
        
        
        
    }
    
}
