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
public class MultiThreadingThreadPriority {
     public static void main(String[] args) throws Exception {
        
       // So we have class Hellooo and Hiii which is only used once and its only purpose is to use Runnable Interface
       //So ()-> {  } using these Lambda expression cobe can be reduced
        Runnable obj1 = ()->
                           {
                             for(int i = 0  ; i < 5 ; i++){
                             System.out.println("Hi" + Thread.currentThread().getPriority());
                             try{ Thread.sleep(500);}catch(Exception e){};
                               }
                            };
        Runnable obj2 = ()->
                            {
                              for(int i = 0  ; i < 5 ; i++){
                                System.out.println("Hello"+ Thread.currentThread().getPriority());
                                try{ Thread.sleep(500);}catch(Exception e){};
                                }
                            };
        
//        obj1.start();
//        obj2.start();
        //You cannot call start because it is in Thread class and we are implementing Runnable interface
        //Runnable interface has only one method RUN
        
        //So we will create an object of Thread class 
        //Thread class constructor accpets object of Runnvale 
        
        Thread t1 = new Thread(obj1);
 
        Thread t2 = new Thread(obj2);
                t1.setName("Hi thread");
        t2.setName("Hello thread");
         System.out.println("Before setting priority"+t1.getPriority());
           System.out.println("Before setting priority"+t2.getPriority());
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println("After setting priority"+t1.getPriority());
           System.out.println("After setting priority"+t2.getPriority());
         System.out.println(t1.getName());
         System.out.println(t2.getName());
        
        t1.start();
               try{ Thread.sleep(10);}catch(Exception e){};
        t2.start();
        

    }
}
