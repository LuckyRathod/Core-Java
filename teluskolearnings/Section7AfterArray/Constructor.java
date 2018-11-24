   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section7AfterArray;

/**
 *
 * @author Lucky_Rathod
 */
class Abc{
    
    //Constructor overloading 
    //same name and different args
    
    public Abc(){
        System.out.println("In default constructor\n");
    }
    
    public Abc(int i){
        System.out.println("In parameterized constructor "+i+"\n");
    }
}

class ImplicitConversion{
    
    //Now when int wala args constructor is commented and we call constructor with some int value at object instantiation
    //Then it performs implicit conversion and calls double wala args constructor
    
    //But vice versa IS not possible 
    
//    public ImplicitConversion(int i){
//        System.out.println("Implicit conversion int");
//    }
    public ImplicitConversion(double d){
        System.out.println("Implicit conversion double");
    }
}
public class Constructor {
    
    public static void main(String[] args) {
        
        Abc objDefault = new Abc();
        Abc objParam = new Abc(5);
        
        ImplicitConversion obj = new ImplicitConversion(5);
       
    }
    
}
