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
public class FindFirstOrElse {
    
    public static void main(String[] args) {
        
        List<Integer> values = Arrays.asList(12,15,20,30,61,65);
        values.stream().filter(i->i%5==0).forEach(System.out::println);
        
        //There might be case where there will no Number Divisible by 5
        //o/p Optional.empty
        //If diviisble by 5 then also o/p Optional[5]
        //TO change the format use orElse()
        System.out.println(values.stream().filter(i->i%5==0).findFirst().orElse(0));
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
