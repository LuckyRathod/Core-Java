/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12FileHandingSerializationReflectionApi;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author Lucky_Rathod
 */
public class ObjectDeSerializationXml {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        
        XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("F:\\Learning java\\Telusko_185\\ObjectSerializationSection12\\ObjectXml.xml")));
        
        College c = (College)x.readObject();
        List<Student> s = c.getStudents();
        
        for(Student values : s){
            System.out.println(values);  //will call toString() which is overriden
        }
        
    }
    
}
