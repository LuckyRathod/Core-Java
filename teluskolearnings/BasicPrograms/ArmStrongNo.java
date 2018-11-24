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
public class ArmStrongNo {
    //153 --> 1^3 + 5^3 +3^3 --> 153 if same then armstrong
    
    
    public static  void show(){
        
                Scanner scan  = new Scanner(System.in);
        int no = scan.nextInt();
        int r , sum =0 ;
        int temp = no;
        while(no > 0){
            r = no %10;
            no = no /10;
            sum = sum + r*r*r;
        }
        if(temp == sum)
            System.out.println("Armstrong no");
        else
            System.out.println("Not an Armstrong no");
    }
    
    public static void main(String[] args) {
        
 
        show();

        }
        
    }
    

