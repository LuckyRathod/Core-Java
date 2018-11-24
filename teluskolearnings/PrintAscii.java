/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucky_Rathod
 */
public class PrintAscii {
    public static void main(String[] args) {
        
        //ASCII means every key in keyboard has ASCII value 
        //Range --> 0 - 127 i-e 128
        List<Character> a = new ArrayList<>();
        for(int i = 0 ; i<=127 ; i++){
            a.add((char)i);
            
            
            //or
            
           // System.out.printf("%d %c \n",i,i);
        }
        System.out.println(a);
    }
    
}
