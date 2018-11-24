/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section10ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Lucky_Rathod
 */
public class CheckedExceptionDemo {
    
    public static void main(String[] args) {
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i=8,j=0,k=0;
    try{
    j = Integer.parseInt(br.readLine());
    k = i/j;
    System.out.println(k);
    }
    catch(IOException e){
        System.out.println("Io Exception");
    }
            
    
    } 
}
