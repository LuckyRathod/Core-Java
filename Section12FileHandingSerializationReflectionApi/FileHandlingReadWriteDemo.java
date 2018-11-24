/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section12FileHandingSerializationReflectionApi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lucky_Rathod
 */
public class FileHandlingReadWriteDemo {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name .. !");
        String name = scan.nextLine();
        
        File f = new File("F:\\Learning java\\Telusko_185\\Section12FileHandling\\Demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Welcome "+name);
        //open File with  wordpad
        System.out.println("File Generated ");
        
        System.out.println("Reading from file");
        
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
        
    }
    
}
