/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section9StringsAndUserInput;

/**
 *
 * @author Lucky_Rathod
 */
public class StringSplitMethod {
    
    public static void main(String[] args) {
        
        String str = "Lucky,Rathod,Male";
        //str is immutable we cannot change the value
        //To change it we need to use mutable String 
        //i-e StringBuffer or StringBuilder
        
        //However we cannot update str
        //str = "Rathod";
        
        
       String values[] =  str.split(",");
       for(String val : values){
           System.out.println(val);
       }
    }
    
}
