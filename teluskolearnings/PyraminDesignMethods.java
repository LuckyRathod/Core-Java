/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings;

import java.util.Scanner;

/**
 *
 * @author Lucky_Rathod
 */
public class PyraminDesignMethods {
    public static void main(String[] args) {
        /*
                    *
                   * *
                  * * *
                 * * * *
        
        
        
        */
        int i,j,k;
        for(i=1;i<=4;i++){
            for(k=3;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                
                System.out.print("*");
                if(j!=i)
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        
        /*
         
                1
               1 2
              1 2 3
             1 2 3 4
        
        */
        
         for(i=1;i<=4;i++){
            for(k=3;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                
                System.out.print(j);
                if(j!=i)
                    System.out.print(" ");
            }
            System.out.println();
        }
         
         /*
         
            * * * *
             * * *
              * *
               *
         */
         
         for(i=1;i<=4;i++){
             for(k=1;k<=i-1;k++){
                 System.out.print(" ");
             }
             for(j=4;j>=i;j--){
                 System.out.print("*");
                 if(j!=i)
                     System.out.print(" ");
                 }
             System.out.println();
             }
         
         
         
         for(i=1;i<=4;i++){
             for(k=1;k<=i-1;k++){
                 System.out.print(" ");
             }
             for(j=4;j>=i;j--){
                 System.out.print(j);
                 if(j!=i)
                     System.out.print(" ");
                 }
             System.out.println();
             }
         
         
         /*
         
                    0
                   1 2
                  3 4 5
                 6 7 8 9 
         
         */
         int num=0;
                  for(i=1;i<=4;i++){
            for(k=3;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(num);
                if(j!=i)
                    System.out.print(" ");
                num++;
            }
            System.out.println();
        }
         
             
         }
        
    }
    

