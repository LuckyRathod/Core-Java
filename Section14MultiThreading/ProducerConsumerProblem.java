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

class Quanitity{
    int num;
    boolean valueSet = false;
    //When we use wait() the method that uses it must be syncronized
    public synchronized void put(int num){
        
        while(valueSet){
            try{wait();}catch(Exception e){};
        }
        System.out.println("Put: "+num);
        this.num = num;
        valueSet= true;
        //wait() and notify() belongs to object class
        notify(); //Notifies the consumer
    }
    public synchronized void get(){
        
        while(!valueSet){
            try{wait();}catch(Exception e){};
        }
        System.out.println("Get: "+num);
        valueSet = false;
        notify(); //Notifies the producer
    }
}

class Producer implements Runnable{
    
    
    Quanitity q ;
    public Producer(Quanitity q){
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }
    public void run(){
        int i = 0;
        while(true){
            //Now we will put the item produced in Quanitity
            q.put(i++);
            try{Thread.sleep(1000);}catch(Exception e){};     
        }
    }
}
class Consumer implements Runnable{
    
    
    Quanitity q ;
    public Consumer(Quanitity q){
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    public void run(){
        int i = 0;
        while(true){
            //Now we will put the item produced in Quanitity
            q.get();
            try{Thread.sleep(1000);}catch(Exception e){};     
        }
    }
}
public class ProducerConsumerProblem {
    public static void main(String[] args) {
          Quanitity q = new Quanitity();
    new Producer(q);
    new Consumer(q);  
    }

    
}
