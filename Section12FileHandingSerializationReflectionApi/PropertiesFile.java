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
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Lucky_Rathod
 */
public class PropertiesFile {
    
    
    //When u work with Hibernate frame work you need to write configuration file or Property file
    //Property file is nothing but the key-value pair
    //url-> value 
    //uname -> value
    //pass-> value
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
       //Now if we want to store some data in key value pair in file
       //Then one option is to create a Hashmap store key value in it 
       //And then use WriteUTF
       
       //It becomes tedious 
       //So Java Provides PROPERTIES CLASS 
       //which works same as above concept
       
       //p.store(outputStreamObj,null-->Comments)
       //p.load(inputStreamObj);
       //p.list(System.out) -->To retrieve all key value pairs
        
        Properties p = new Properties();
        
        File f = new File("F:\\Learning java\\Telusko_185\\PropertiesFile\\demoProperty.properties");
        OutputStream os = new FileOutputStream(f);
        p.setProperty("name", "Lucky");
        p.setProperty("pass","lucky4850");
        p.store(os, null);
        System.out.println("Property file generated");
        
        
        //Reading from properties file
        System.out.println("Reading from file");
        InputStream is = new FileInputStream(f);
        p.load(is);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("pass"));
        p.list(System.out);
    }
    
}
