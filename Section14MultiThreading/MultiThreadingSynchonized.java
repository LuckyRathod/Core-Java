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
class Counter {
    int count;
    
    //When you dont make mehtod synchronized 
    //Means if two threads implements your inc mehtod same time
    //both will fetch same value
    // count = 600
    // t1 ->inc() -> 601
    //t2 -> inc() -> 601 
    //o/p ->602
    //So to achieve these synchronized should be used 
    //Only one thread can execute that inc() at a time
    public synchronized  void increment(){
        count = count + 1 ;
    }
}
public class MultiThreadingSynchonized {
    
    public static void main(String[] args) throws Exception {
        
        
        Counter c = new Counter();
        
        Thread t1 = new Thread(()->
                           {
                             for(int i = 0  ; i < 1000 ; i++){
                             c.increment();
                             }
                            });
                Thread t2 = new Thread(()->
                           {
                             for(int i = 0  ; i < 1000 ; i++){
                             c.increment();
                             }
                            });
                
               t1.start();
               t2.start();
               t1.join();
               t2.join();
        System.out.println(c.count);
    }
    
}
