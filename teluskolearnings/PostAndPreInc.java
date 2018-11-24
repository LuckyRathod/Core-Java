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
public class PostAndPreInc {
    public static void main(String[] args) {
        int i = 5 ;
        int j;
        
        System.out.println("Post Increment");
        j=i++;
        System.out.println("j : " + j +" i : " + i);
        
        System.out.println("Pre Increment");
        j=0;i=5;
        j = ++i;
        System.out.println("j : " + j +" i : " + i);
        System.out.println("Tricky condition");
        j=0;i=5;
        i = i++;
        //Above condition is same as 
//        int temp;
//        temp = i;
//        i++;
//        i=temp;
        System.out.println(i);
    }
}
