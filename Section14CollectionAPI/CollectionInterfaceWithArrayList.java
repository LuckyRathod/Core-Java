/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import com.sun.org.apache.xerces.internal.impl.xs.identity.ValueStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import static net.glxn.qrgen.image.ImageType.values;

/**
 *
 * @author Lucky_Rathod
 */
public class CollectionInterfaceWithArrayList {
    
    //Collection was introduced for dynamic array
    //Collection cannot be used to insert the element in between
    public static void main(String[] args) {
           Collection values = new ArrayList();
           values.add("Lucky");
           values.add(5);
           values.add(5.5);
           
          //To fetch the values from Cooletction
          //Iterator
          //for each loop
          System.out.println("Iterator");
          Iterator i = values.iterator();
          
          while(i.hasNext()){
              System.out.println(i.next());
          }
          System.out.println("Using For loop");
          for( Object  value : values ){
              System.out.println(value);
          }
            //Use of Generics in Collection
            Collection<Integer> valueInt = new ArrayList<>();
            valueInt.add(5);
            valueInt.add(10);
            //cannot add value between two 
            //thats why we use LIST
            System.out.println(valueInt);
      
    }
    
 
    
    
    
  
    
}
