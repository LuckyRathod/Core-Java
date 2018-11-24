/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Arrays;

import java.util.Scanner;

/**
 *
 * @author Lucky_Rathod
 */
public class TwoDimensionalArray {
    
    public static void main(String[] args) {
        
        
        //2D ARRAY CONCEPT
//        int a[] = {1,2,3,4};
//        int b[] = {5,6,7,8};
//        int c[] = {9,10,11,12};
//        //Now we will store these arrays in one variale and these concept is called 2D array
//        
//        //Static assignent
//        int x[][] = {
//                    {1,2,3,4} , 
//                    {5,6,7,8} ,
//                    {9,10,11,12}
//                    };
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows and coulumns you want \n");
        int r = scan.nextInt();
        int c = scan.nextInt();
        
        int twoD[][] = new int[r][c];
        System.out.println("Enter array elements\n");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                
                twoD[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array elements are using for loop");
        for(int i=0 ; i < r ; i++){
            for(int j=0; j < c ;j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("Array elements are using enhanced for loop");
            for(int newTwoD[] : twoD)
            {
                for(int finalTwoD : newTwoD){
                    System.out.print(finalTwoD + " ");
                }
                System.out.println();
            }
        
    }
    
}
