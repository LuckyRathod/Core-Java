/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section7AfterArray;

/**
 *
 * @author Lucky_Rathod
 */

//In these program we will count the no of objects created by Class


class A{
    int i;
    //Class varaible or static varaible
    //Which is shared among objects of classes
    //And it is updated in every object if one object update it
    static int j;
    //Now we know that everytime when an object is instantiated we make use of constructor
    
    public A(){
        i++;
        j++;
    }
    
    public void counter(){
        
        System.out.println("Output when not using Class variable " + i);
        System.out.println("Output when using Class variable " + j);
    }
}
public class ClassVariable {
    
    public static void main(String[] args) {
        
        A obj1 = new A();
        obj1.counter();
        A obj2 = new A();
        obj2.counter();
        
        //Now here output is 1 because 'i' is an instance varaible
        //And it has seperate copy for each variable 
        //So every time each obj initialized i with 0 and inc it by 1 
        //so o/p is 1
        
        //Now using class varaible 
        A objClass1 = new A();
        A objClass2 = new A();
        A objClass3 = new A();
        objClass1.counter();

        
        

    }
    
}
