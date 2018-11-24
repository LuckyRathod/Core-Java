/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.BasicPrograms;

import java.util.Scanner;

/**
 *
 * @author Lucky_Rathod
 */
public class PrimeOrNot {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        boolean isPrime = true;
        
        
        //Now to make our for loop faaster we can also write
        //for(int i = 2 ; i < no/2 ; i++)
        //OR
        //for(int i= 2 ; i < Math.sqrt(no);i++)
        for(int i = 2 ; i < no ; i++){
            
            //Now we know that prime no can only be divided by itself and 1 
            //We have use these loop excluding the no itself and 1 therefore it starts from 2
            //Now we will find factors
            //If factors are found then it is Not a Prime no
            if(no % i == 0){
                isPrime = false;
                break;
            }
        }
        
        if(isPrime){
            System.out.println("Prime no");
        }
        else
            System.out.println("Not a Prime no");
    }
    
}
