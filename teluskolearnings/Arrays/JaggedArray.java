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
public class JaggedArray {
    
    public static void main(String[] args) {
        
        
        //Static assignment
        
        int p[][] = {
                        {1,2,3,4},
                        {5,6},
                        {7,8,9}
                    };
        
        for(int i[] : p){
            for(int k : i){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
        
        //Dynamic assignment
        
        //Now when u know the no of rows but don know no of columns use these 
        
        int k[][] = new int[3][];
        k[0] = new int[4];
        k[1] = new int[2];
        k[2] = new int[3];
        
    }
    
}
