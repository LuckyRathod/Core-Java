/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section9StringsAndUserInput;

import java.util.Scanner;

/**
 *
 * @author Lucky_Rathod
 */
public class StringOperations {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Strings\n");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        
        System.out.println("Length of Strings");
        System.out.println("s1 " +s1.length()+"\t s2 "+s2.length() + "\n" );
        String s3 = s1.concat(s2);
        System.out.println("Concatenation of two Strings : "+s3);
        System.out.println("Uppercase of s1 : " + s1.toUpperCase());
        
    }
    
}
