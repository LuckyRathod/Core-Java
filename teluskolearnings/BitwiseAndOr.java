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
public class BitwiseAndOr {
    
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
      /*
        1 1 0 0 1
        0 1 1 1 1
        0 1 0 0 1 --> 9 and
        1 1 1 1 1 --> 31 or
        */
        int c = a & b;
        int d = a | b;
        System.out.println("And : "+c+" Or : "+d);
    }
    
}
