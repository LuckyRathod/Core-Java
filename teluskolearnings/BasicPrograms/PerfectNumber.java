package teluskolearnings.BasicPrograms;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucky_Rathod
 */
public class PerfectNumber {
    
    //6 -->Factors -> 1 2 3 --> Add factors -> 1 + 2 + 3 = 6 same as i/p
    
    public static boolean isPerfect(int no){
        
      int sum = 0;
      
      for(int i = 1 ; i < no ; i++){
          if(no % i == 0 ){
              sum = sum + i ;
          }
      }
      if(no == sum)
          return true;
      return false;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        
        boolean b = isPerfect(no);
        if(b) 
            System.out.println("Pefect Number");
        else
           System.out.println("Not a Perfect Number");
        
    }
    
}
