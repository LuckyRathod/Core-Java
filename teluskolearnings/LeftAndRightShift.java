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
public class LeftAndRightShift {
    
    public static void main(String[] args) {
        //Left shift
        //1 0 0 0 . 0 0 0 0  --> 1 0 0 0 0 0 . 0 0
        //Right shift 
        //1 0 0 0 . 0 0 0 0 --> 0 0 1 0 .0 0 0 0 0 0 
        
        int a = 8; //1 0 0 0
        System.out.println("Left shift");
        int b = a << 2; // 2 Zeros will be appended --> 1 0 0 0 0 0 -->Decimal (32)
        System.out.println(b);
        a=8;b=0;
        System.out.println("Right shift");
         b = a >> 2;//Bits will be moved to right side from left
         //1 0 0 0 --> 10--> 0 0 1 0
         System.out.println(b)  ;
    }
    
}
