/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Arrays;

/**
 *
 * @author Lucky_Rathod
 */
public class ThreeDimensionalArray {
    
    public static void main(String[] args) {
        
        int c[][][] = new int[4][4][4];
                for(int i=0 ; i< 4 ;i++){
            for(int j = 0 ; j< 4 ; j++){
                for(int k=0 ; k<4;k++){
                   c[i][j][k] = i+j+k;
                }
            }
            System.out.println();
        }
        
        for(int i=0 ; i< 4 ;i++){
            for(int j = 0 ; j< 4 ; j++){
                for(int k=0 ; k<4;k++){
                    System.out.print(c[i][j][k] + " ");
                }
            }
           
        }
        System.out.println("\nUsing Enhanced for loop");
        for(int i[][] : c){
            for(int j[] : i){
                for(int k : j){
                    System.out.print(k+ " ");
                }
            }
            System.out.println();
        }
    }
    
}
