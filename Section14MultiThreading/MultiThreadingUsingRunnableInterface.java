 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14MultiThreading;

/**
 *
 * @author Lucky_Rathod
 */

class Hii implements Runnable{
    public void run(){
                for(int i = 0  ; i < 5 ; i++){
        System.out.println("Hi");
       try{ Thread.sleep(500);}catch(Exception e){};
        }
        
    }
}
class Helloo implements Runnable{
    public void run(){
                for(int i = 0  ; i < 5 ; i++){
        System.out.println("Hello");
        try{ Thread.sleep(500);}catch(Exception e){};
        }
    }
}
public class MultiThreadingUsingRunnableInterface {
    
    public static void main(String[] args) {
        
        Hii obj1 = new Hii();
        Helloo obj2 = new Helloo();
        
//        obj1.start();
//        obj2.start();
        //You cannot call start because it is in Thread class and we are implementing Runnable interface
        //Runnable interface has only one method RUN
        
        //So we will create an object of Thread class 
        //Thread class constructor accpets object of Runnvale 
        
        Thread t1 = new Thread(obj1);
 
        Thread t2 = new Thread(obj2);
        t1.start();
               try{ Thread.sleep(10);}catch(Exception e){};
        t2.start();
    }
}
