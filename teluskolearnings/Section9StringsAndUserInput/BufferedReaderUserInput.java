/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section9StringsAndUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucky_Rathod
 */
public class BufferedReaderUserInput {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Accepting int");
        int n = Integer.parseInt(br.readLine());
        int i = br.read();
        System.out.println(n+"\n"+(char)i);
        br.readLine();  //Next line cannot be read if u dont write these line
        //So to accept string after br.read() use br.readLine() before it
        System.out.println("Accepting string");
        String s = br.readLine();
        System.out.println(s);
    }
}
