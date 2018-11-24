/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12FileHandingSerializationReflectionApi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Lucky_Rathod
 */
public class ObjectSerializationWithInterface {
    
    //Writting state of an object into byte stream  
    //Means saving the state of variables of objects 
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Save obj = new Save();
        obj.i = 4 ;
        
        //Now we need to save the state of an object into file
        
        File f = new File("F:\\Learning java\\Telusko_185\\ObjectSerializationSection12\\Object.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        System.out.println("State of an object Saved");
        System.out.println("Retreving the state of an object from Object.txt");
        
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save)ois.readObject();
        System.out.println("Value retreived from saved state of Object.txt = "+obj1.i);
        
    }
    
}

class Save implements Serializable
{
    int i;
}
