 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.BasicPrograms;

/**
 *
 * @author Lucky_Rathod
 */
public class SwappingofNumberInFourWays {
    
    public static void usingTemp(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b );
    }
        public static void withoutUsingTemp(int a , int b){
        
            a = a+ b;
            b = a - b;
            a = a - b;
        System.out.println("a = " + a + " b = " + b );
    }
            public static void savingOneBitFromSecondWay(int a , int b){

                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
        System.out.println("a = " + a + " b = " + b );
    }
                public static void easiestWay(int a , int b){
                    
                    b = a+b - (a = b);
        System.out.println("a = " + a + " b = " + b );
    }
                
    
    public static void main(String[] args) {
        
        
        int a = 5 , b = 6 ;
        usingTemp(a,b);
        withoutUsingTemp(a,b);
        savingOneBitFromSecondWay(a,b);
        easiestWay(a,b);
    }
    
}
