/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section8.Polymorphism;

/**
 *
 * @author Lucky_Rathod
 */


class OverrideADispatch{
    
    public void show(){
        System.out.println("In parent class");
    }
    
}

class OverrideBDispatch extends  OverrideADispatch{
    
    //Now here show method gets virtually added because we extended OverrideA
    //Now when we write same method name with same type,same args,same name in subclass
    //Then it is called as Method Overriding
    
    public void show(){
        System.out.println("In sub class ");
    }
}
public class DynamicMethodDispatch {
    
    //Dynamic method dispatch --> We are deciding which method to call at  run time
    //Method Overriding works woth Dynamic method dispatch
    
    public static void main(String[] args) {
        
        OverrideADispatch obj1 = new OverrideADispatch();
        OverrideBDispatch obj2 = new OverrideBDispatch();
        
        
        //Here we will be creating only the reference of OverrideADispatch
        OverrideADispatch a;
        
        a = obj2;
        
        a.show();
    }
    
}
