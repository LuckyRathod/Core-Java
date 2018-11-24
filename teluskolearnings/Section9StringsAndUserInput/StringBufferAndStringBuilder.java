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
public class StringBufferAndStringBuilder {
    
    public static void main(String[] args) {
        
        // String is immutable meaning if we create a new String and assign a value
        //then we cannot change it 
        //If we change it then it will not replace a old object it will create a new object
        
        
        //  To avoid these we can use StringBuffer and StringBuilder
        
        //StringBuffer is safe from multiple threads means provides SYNCHRONIZATION
        //StringBuilder is not safe from muliple threads means doesnt provide SYNCHRONIZATION
        
        StringBuffer sbf = new StringBuffer();
        sbf.append("Navin");
        sbf.append(" Reddy");
        System.out.println(sbf);
        System.out.println(sbf.capacity());
        System.out.println(sbf.insert(11, " Tutorials"));
        
        StringBuilder sbfb = new StringBuilder();
        sbfb.append("Navin");
        sbfb.append(" Reddy");
        System.out.println(sbfb);
        System.out.println(sbfb.capacity());
        System.out.println(sbfb.insert(11, " Tutorials"));
    }
}
