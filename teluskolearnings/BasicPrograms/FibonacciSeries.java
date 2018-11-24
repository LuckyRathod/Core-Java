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
public class FibonacciSeries {
    
    // 0 1 1 2 3 5 8 13 21 ........n
    
    public static void main(String args[]){
        
        
        int a = 0 , b = 1 , k = 0 ;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.print(a + " " + b + " ");
        
        for( k= 0 ; k<=n ; k++){
            k = a + b;
            if(k >= n)
                break;
            System.out.print(k+" ");
            a=b;
            b=k;
            
        }
        
        
        
    }
    
}
