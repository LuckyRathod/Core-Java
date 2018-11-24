/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section10ExceptionHandling;

/**
 *
 * @author Lucky_Rathod
 */
public class TryWithMultipleCatch {
    
    
        public static void main(String[] args) {
        
        
        //Exception can be handled
        //Due to exception flow of execution goes on it cannot be stoped
        
        int i=8,j=2,k=0;  //Normal statement
        int a[] = new int[4];
        try{
        k = i/j;          //Critical statement
        
        for(int c = 0 ; c <= 4 ; c++){
            a[c] = c+1;
        }
        for(int value : a){
            System.out.println(value);
        }
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Divide by zero error"); //Unchecked Exception
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
            System.out.println("Number should be not be greater then 4");
        }
        System.out.println(k);
        
    }
    
}
