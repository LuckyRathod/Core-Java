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

class AthisDemo{
    
    int x ;
    public AthisDemo(int x){
        
        //This represents current instance 
        //If there are 5 instance and you are working on 4th instance 
        //Then this represents 4th instance 
        //Because at a time only one instance is done
        this.x = x;
        
    }
    
    public int getX(){
        return x;
    }
}
public class ThisKeywordDemo {
    
    public static void main(String[] args) {
          AthisDemo obj = new AthisDemo(6);
          System.out.println(obj.getX());
      
    }

    
}
