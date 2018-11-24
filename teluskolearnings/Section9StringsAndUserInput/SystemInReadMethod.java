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
public class SystemInReadMethod {
    
    public static void main(String[] args) throws Exception{
        //read methods return int value 
        // It reads characeter by character and convert it into ASCII value i-e int
        int i = System.in.read();
        System.out.println("ASCII value of input entered above");
        System.out.println(i);
        System.out.println("Input taken --> USE OF TYPE CASTING ");
        System.out.println((char)i);
        
        //Drawback it only reads Character // String cannot be readen
        //One way to achieve these is 
        //Read untill you want using while loop 
        //In which update the string
        String str = "";
        while((i = System.in.read()) != 48) //ASCII VALUE 48 --> 0 zero
        {
            str = str + (char)i;
        }
        System.out.println(str);
    }
    
}
