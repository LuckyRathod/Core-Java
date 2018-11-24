/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings;

/**
 *
 * @author Lucky_Rathod
 */
public class ShortHandOperators {
    
    public static void main(String[] args) {
        
        byte b = 8 ;
        
        //Now here we need to type cast because 2.5 is double
         b =(byte)(b * 2.5);
         System.out.println(b);
         
         b *= 2.5; //Now in these case we dont need to type caste because it will always take type of left operand as result
         //Type(E1) opearnd (E2) --> b *= 2.5 
         
    }
    
}
