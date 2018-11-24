/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12FileHandingSerializationReflectionApi;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucky_Rathod
 */
public class ObjectSerializationXml {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Student st1 = new Student();
        st1.setRollno(101);
        st1.setSname("Lucky");
        Student st2 = new Student();
        st2.setRollno(102);
        st2.setSname("Aditya");
        
        College c = new College();
        List<Student> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);
        c.setStudents(s);
        
        //Will save state of an object using XML
         XMLEncoder x = new XMLEncoder(new BufferedOutputStream(
                                                        new FileOutputStream("F:\\Learning java\\Telusko_185\\ObjectSerializationSection12\\ObjectXml.xml")));
         
         x.writeObject(c);
         x.close();
         System.out.println("XML file Genrated Serialization ");
    }
    
}
