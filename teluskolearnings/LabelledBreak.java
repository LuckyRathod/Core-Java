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
public class LabelledBreak {
    
    public static void main(String[] args) {
        System.out.println("Using unLabelled break ");
        for(int i=1 ; i<=4 ; i++){
             for(int j=1 ; j<=4 ; j++){
                if(i==3)
                    break;
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Using Labelled break ");
        firstLabelBreak : for(int i=1 ; i<=4 ; i++){
             for(int j=1 ; j<=4 ; j++){
                if(i==3)
                    break firstLabelBreak;
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
