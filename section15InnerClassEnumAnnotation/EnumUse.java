/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section15InnerClassEnumAnnotation;

/**
 *
 * @author Lucky_Rathod
 */
public class EnumUse {
    
    //When you know the predefined set of value use Enum
    //Week -> Sunday,Monday,Tuesday ...
    //Directions -> East,West.....
    
    //Enum can be created inside the class also
    //After compilation a Class is Generated of ENUM Name and whatever CONSTANTS we defined 
    //will become static final OBJECTS of that Enum 
    
    //So thats why to access Enum Constants we write EnumName.ConstantName because ConstantName is Static object 
    
    
    //Enum can be used in Switch Case also
    
    //We can define Variables,Methods,Constructor in Enum which is not supported in C,C++,
    
    //Now to assign the values to CONSTANT of Enum we can makke use of Parameterized Constructor because they are static final objects
    
    enum Mobile{
        
        
        //After compilation it becomes
        /*
        class Mobile{
        
                //Now to assign the value we can pass it in constructor 
        
            static final Mobile APPLE = new Mobile();
            static final Mobile HTC = new Mobile();
        }
        */
        
        //But in Enum we can directly pass the value  in bracket
        APPLE(100),SAMSUNG,HTC(90);
        
        //creation of variable,methods,constructor in enum
        
        Mobile(){
            //when default constructor is called 
            price = 80;
            System.out.println("Default constructor called ");
            
        }
        
        Mobile(int p){
            //When parameterized constructor is called
            
            price = p ; 
        }
        int price;
        public int getPrice(){
            return price;
        }
        
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println(Mobile.SAMSUNG.getPrice());
        System.out.println(Mobile.HTC.getPrice());
        
        
        //use of switch
        //Switch need an object of enum and since CONSTANTS are nothing but satic final objects
        
        switch(Mobile.APPLE){
            case APPLE:
                System.out.println("Apple is best");
                break;
            case SAMSUNG:
                System.out.println("Samsung is better");
                break;
                 
        }
        //Every CONSTANTS have order no
        //To fetch all CONSTANS we can use 
        
        Mobile m[] = Mobile.values(); 
        for(Mobile mobile : m){
            System.out.println(mobile);
        }
    }
    
    
}
