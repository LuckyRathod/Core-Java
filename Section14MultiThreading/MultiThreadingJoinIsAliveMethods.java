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
public class MultiThreadingJoinIsAliveMethods {
    public static void main(String[] args) throws Exception {
        
       // So we have class Hellooo and Hiii which is only used once and its only purpose is to use Runnable Interface
       //So ()-> {  } using these Lambda expression cobe can be reduced
        Runnable obj1 = ()->
                           {
                             for(int i = 0  ; i < 5 ; i++){
                             System.out.println("Hi");
                             try{ Thread.sleep(500);}catch(Exception e){};
                               }
                            };
        Runnable obj2 = ()->
                            {
                              for(int i = 0  ; i < 5 ; i++){
                                System.out.println("Hello");
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
        t1.start();
               try{ Thread.sleep(10);}catch(Exception e){};
        t2.start();
        
        
        //Now when we dont use join then Bye will be printed at first 
        //Because t1 goes on another thread 
        //t2 goes on another thread
        //Main thread remains idle
        //So it executes following statements
        //To avoid these Join() is used
        //Join will wait untill t1 and t2 jobs are comleted and they are joined again on main thread
        
        
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
