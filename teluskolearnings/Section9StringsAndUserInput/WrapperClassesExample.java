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
public class WrapperClassesExample {
    
    public static void main(String[] args) {
        
        
        int i = 5; //Primitive type
        
        Integer iobj = new Integer(5);
        Integer jObj = new Integer(i);  //Putting value of primiive variable in object is called 
                                        //Wrapping or Boxing
        Integer kObj = i;               //Here Java compiler Automatically does Boxing
                                        //Therefore it is known as AUTO Boxing
                                        
        int j = jObj.intValue();        //UN-Boxing or Unwrapping
        int k = kObj ;                  //AUTO-UN Boxing 
        
        System.out.println(iobj.toString());
        System.out.println(jObj.toString());
        System.out.println(kObj.toString());
        System.out.println(j);
        System.out.println(k);
        
                                     
                                  
    }
    
}
