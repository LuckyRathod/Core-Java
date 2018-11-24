/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings;

/**
 *
 * @author Lucky_Rathod
 */
public class TernaryOperator {
    
    public static void main(String args[]){
        
        int i = 1,j;
//        if(i==1)
//           j = 6;
//        else
//            j = 7;
//        System.out.println(j);

//Now we will replace above if-else in one line

        j = (i==1)?6:7;
        System.out.println(j);
        
        //Now we will see that these ternary opearotor does really works as an replacement of if-else
        Object obj1,obj2;
        if(true)
            obj1=new Integer(10);
        else
            obj1=new Double(20);
        
        System.out.println("Output by using If-Else "+ obj1);
        
        obj2 = true?new Integer(10):new Double(25.5);
        System.out.println("Output by not using If-Else " + obj2);
        //Now here the Ans is 10.0 and by using if else Ans is 10
        //These is beacause here the data type of both the conditions are checked and whichever is maximun 
        //The condition that will be result either after ? or : the datatype will get converted to the maximum of two datatypes
        //So conditon is true , exp 1 is executed but its data type will get converted into DOUBLE because it is maximum of both exps
        
    }
    
}
