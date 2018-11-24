/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section10ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucky_Rathod
 */
public class TryWithResources {
    
    public static void main(String[] args) throws IOException {
        
//        String str = "";
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        str = br.readLine();
        
        //Now if we want to close the resource then we need to write it in Finally block
        //But in 1.7 Java introduced TRY WITH Resources
        
        
        //By using that we dont have to close resources in finally block and 
        //We can use TRY without using catch
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
             String str = "";
            
        }
       
    }
    
}
