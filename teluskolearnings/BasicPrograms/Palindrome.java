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
public class Palindrome {
    
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int no = scan.nextInt();
        int remainder , finalno = 0;
        
        int temp = no;
        //Reverse Logic
        while(no > 0){
            
            remainder = no % 10 ;   //no ->123 -->remainder = 3
            //Now we have to break the no by removing 3 
            //So we will use / -->Which only takes quotient
            no = no/10;
            //Now we will muliply by 10 which we got remainder and after that the remainder we will get will be addded
            //3 -> 0 * 10 + 3 ->3
            //2 -> 3 * 10 + 2 ->32
            //1 -> 32 * 10 + 1 ->321
            finalno = finalno * 10 + remainder;
        }
        
        String check = temp == finalno ? "Palindrome" : "Not Palindrome";
        System.out.println(check);
    }
    
}
