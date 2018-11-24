/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section8;

/**
 *
 * @author Lucky_Rathod
 */

class Add{
    
   
    public void add(){
       int  n1=10,n2=5;
        System.out.println("In add");
        System.out.println(n1+n2);
    }
}

class AddSub extends Add{
    

    public void sub(){
        int n1 = 10 , n2 = 5;
        System.out.println("In Sub");
        System.out.println(n1-n2);
    }
}

class AddSubMul extends AddSub{
    
    public void mul(){
        int n1 = 10 , n2 = 5 ;
        System.out.println("In Mul");
        System.out.println(n1 * n2);
    }
}

public class InheritanceSingleMultilevel {
    
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        
        AddSub obj = new AddSub();
        obj.add();
        obj.sub();
        
        AddSubMul obj1 = new AddSubMul();
        System.out.println("Multi level Inheritance");
        obj1.add();
        obj1.sub();
        obj1.mul();
    }
    
    
}
