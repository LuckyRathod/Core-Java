/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.Comparator;

/**
 *
 * @author Lucky_Rathod
 */
public class ComparatorClass<T> implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
       if(o1%10 > o2%10)
           return 1;
       return -1;
    }

   
}
