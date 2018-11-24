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
public class SystemCurrentTimeMillis {
    
    public static void main(String[] args) {
        
        
        long start = System.currentTimeMillis();
        List<Integer> a = new ArrayList<>();
        
        for(int i = 1 ; i < 100000 ;i++){
            
           a.add(i); 
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start +" ms" );
        
        long value = System.currentTimeMillis();
        System.out.println(value); // o/p is unix time stamp 
        // ms from Jan 1st 1970 
        
       //
    }
    
}
