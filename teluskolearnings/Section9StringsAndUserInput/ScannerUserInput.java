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
public class ScannerUserInput {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(i);
       // scan.nextLine(); //If u dont write these line then u cannot take input of next line
       int k = scan.nextInt();
        System.out.println(k);
       // scan.nextLine();
        String s = scan.nextLine();
        System.out.println(s);
        String  n = scan.next();
        System.out.println(n);
        scan.nextLine();//If u dont write these line then u cannot take input of next line
        String s1 = scan.nextLine();
        System.out.println(s1);

        
    }
    
}
