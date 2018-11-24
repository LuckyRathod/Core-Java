/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Lucky_Rathod
 */
public class MapInterfaceExample {
    
    public static void main(String[] args) {
          
    //Till now we used List,ArrayList,LinkedList,Collection,Vector etc
    //But in that if u want to access an element the only way is by using INDEX NO
    
    
    //So if u want to refer a value by some name or key then MAP Interface is used
    
    
    Map<String,String> val = new HashMap<>();
    
    
    //We can also use Hashtable
    
    //Hashtable --> Thread Safe [ Synchronized ]
    //HashMap   --> Not Thread Safe [ Not Synchronized ] 
    val.put("myName","Lucky");
    val.put("actor","John");
    val.put("ceo","Marisa");
    
        System.out.println(val); //Sequence is not mainted because HashMap is used which uses Hashing
        
    // Now to print in our format we need to use for loop 
    //And iterate through each key
    //But to obtain each key we have tpo use map.keySet();
    
    //So keys in HashMap are SET
    // Will store all keys in SET 
    Set<String> keys = val.keySet();
    for(String key : keys){
        System.out.println(key+" "+val.get(key));
    }
      
    
    //Now we know that keys are Set 
    //So if we use key with duplicate 
    //Then what 
    
    
    /*
    So till now we have
    val.put("myName","Lucky");
    val.put("actor","John");
    val.put("ceo","Marisa");
    */
    
    //Now if we put
    val.put("actor","Akshay");
    
    
    //Then in HashMap if duplicate is found then it will replace the value of the old key with new value
    
        System.out.println("\nUse of Dupliation in key");
        Set<String> keyss = val.keySet();
    for(String key : keyss){
        System.out.println(key+" "+val.get(key));
    }
    /*
    actor John
myName Lucky
ceo Marisa

Use of Dupliation in key
actor Akshay
myName Lucky
ceo Marisa
    
    */
    }

}
