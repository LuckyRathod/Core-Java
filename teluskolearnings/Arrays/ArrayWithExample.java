/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucky_Rathod
 */
public class ArrayWithExample {
    
    public static void main(String[] args) {
        
        //Here in java array is made by using object so we need to use "new" keyword
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scan.nextInt();
        
        int a[] = new int[n];
        
        //Now here we can use for loop because it is doing repeated task
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
        
    //If u dont know the size of array then in for loop condition u can use methood of array
    //nameOfArray.length
    
    for(int i = 0; i < a.length ; i++)
    {
        System.out.println("Enter the element for " +i+" position ");
        a[i] = scan.nextInt();
    }
   
    System.out.println("Fetching using for loop");
        for(int i=0 ; i <a.length ;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //Fetching array elements by using enhanced for loop
         System.out.println("Fetching using enhanced  for loop");
        for(int i : a){
            System.out.print(i+" ");
        }
        
        
        //6.6 Array using random class
        
        int b[] = new int[20];
        Random rand  = new Random();
        
        for(int i = 0 ; i < b.length ; i++){
            b[i] = rand.nextInt(50);  //max limit of generating rand no is 50
        }
        System.out.println("\nArray with Random class\n");
        for(int i:b){
            System.out.print(i+" ");
        }
    }
    
}
