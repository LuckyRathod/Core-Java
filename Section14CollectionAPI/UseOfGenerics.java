/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.ArrayList;

/**
 *
 * @author Lucky_Rathod
 */
public class UseOfGenerics {
    
    
    public static void main(String[] args) {
        
       /*  Java is type safe language
        Meaning if we write 
        int value = 8 ;
        value will have datatype int 
        
        
        But when Collection was introduced 
        //We know  that if we dont specify the data type then by Default is Object
        List values = new ArrayList();
        
        
        //Now to make it type safety 
        //Genrics was introduced
        
        List<Integer> values = new ArrayList<>();
        
        //These list will only have Integer values
        
        
        Now if we jump to declaration of List
        then 
        public interface List<E> extends Collection<E>
        E->Element type
        
        
        
        Now to create our own class with Genric type we can do following
        

        */
       
       
       Container<Integer> obj = new Container<>();
       obj.value = 9;
       obj.show(); //o/p java.lang.Integer
       
       
       //Now if we want that our Genric class should only conatin type which extends Number class
       //then Class Container<T extends Number>
       
       //Integer , Float , Double extrends Number 
       //If we specify other then subclass of Number then it will generate an  errror
       
       
       //Genric method  calling
       
       //Integer and Integer in method is fine
       
       obj.demo(new ArrayList<Integer>());
       
       //Now if we write Number then error 
       //Mehtod only accepts Integer 
       //If we want that then use ? extends Number in method
         obj.demo(new ArrayList<Number>());
       
    }
    
}

//Generic class
class Container<T extends Number> 
{
    //We can write Interger Type of value varaible 
    //But we will not be knowing what type of object it can have in future
    T value;
    
    public void show(){
        System.out.println(value.getClass().getName());
    }
    
    //Genric  methods
    /*
    < ? extends T>
    ? --> subclass of T
            
    < ? super T>
    ? --> superclass of T */
    public void demo( ArrayList<? extends Number > obj){ //or we can also replace Number with T
        
    }
}
