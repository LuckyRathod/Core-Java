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


        //Now to print Hi if it takes 5 sec i-e if we put it in sleep after printing 1 Hi for 1 sec
        //Then to print 5 times it will take 5 sec
        //5sec will be wasted 
        //By that time what we can do is print hello
        //These is called MULTI-THREADING
class Hi extends Thread{
    public void run() {
        for(int i = 0  ; i < 5 ; i++){
        System.out.println("Hi");
       try{ Thread.sleep(500);}catch(Exception e){};
        }
    }
}
class Hello extends Thread{
    public void run() {
        for(int i = 0  ; i < 5 ; i++){
        System.out.println("Hello");
        try{ Thread.sleep(500);}catch(Exception e){};
        }
    }
}
public class MultiThreadingUsingThreadClass {
    
    public static void main(String[] args) {
        
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        
//        System.out.println("Without using thread first hi will be printed then hello ");
//        obj1.show();
//        obj2.show();
        
        
        //Now to call Thread we need to call start method
        obj1.start(); // it will call run method which is overriden in subclass of Thread
      //  obj2.start();
        
        
                //Now here when Hi and Hello reaches scheduler at same time 
        ///Scheduler will select any random thread 
        //Thats why we got o/p
        // hi hello hi hello hello hi hello ..
        //To v=avoid these we can call another start method on obj2 after some time

        try{Thread.sleep(10);}catch(Exception e){};
        obj2.start();
        
        

        
    }
}
