/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section11ObjectCloning;

/**
 *
 * @author Lucky_Rathod
 */
public class TypesOfCopyingObject {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.i = 5;
        obj.j = 6;
        System.out.println(obj);
        
        //Shallow copy
        //Create two reference varaibles that refers to same object
        A obj1 = obj;
        System.out.println(obj1);
        
        //Now disadvantage of shallow copy is that if we change the 
        //value of i or j then it will reflect on both obj and obj1
        obj1.j = 8;
        System.out.println("Shallow copy change in varaibles obj1 "+obj1);
        System.out.println("Shallow copy change in varaibles obj" + obj);
        
        
        //Deep copy 
        
        //Manually create a new object and assign value of i and j of pold to new object
        
        A objD = new A();
        objD.i = obj.i;
        objD.j = obj.j;
        System.out.println("Deep copy Manually "+objD);
        
        objD.i = 6;
        System.out.println("Deep changing varaibles "+objD);
        System.out.println("Deep changing varaibles not relecting "+obj);
        
        
    }
    
}

class A{
    
    int i;
    int j;

    @Override
    public String toString() {
        return "A{" + "i=" + i + ", j=" + j + '}';
    }
    
    
}
