/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section14CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lucky_Rathod
 */
class Students implements Comparable<Students>

{
    int rollno;
    int marks;

    public Students(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    
    //Now if we directly print object then hash value will be printed 
    ///to overcome that we need to override toString()
    @Override
    public String toString() {
        return "Students{" + "rollno=" + rollno + ", marks=" + marks + '}';
    }
    
    public int compareTo(Students s){
        
        //It is similar to compare()of Comparator Interface
        //In compare() it takes two parameters 
        //Because other one was doing the job of comparing
        
        
        //In compareTo() only one parameter is passes
        //Because it gets comapred with current object
        
        return this.marks>s.marks?-1:this.marks<s.marks?1:0;
    }
    
    
}
public class UseOfComparableInterface {
    
    public static void main(String[] args) {
        
        
        //Now we will be adding all object of Student in List
       
       List<Students> studs = new ArrayList<>();
       
       studs.add(new Students(1,55));
        studs.add(new Students(2,45));
         studs.add(new Students(3,65));
          studs.add(new Students(4,35));
           studs.add(new Students(5,95));

           
           //Now if we use Collections.sort(studs,()->{}); approach
           //Then it is quite tedious 
           //Now if all these can be done by the Custom class itself then it would be better
           //Meaning if Student class was able to figure out the sorting 
           //Then we dont have to use 1st approach
           
           //Now to we can use Comparable Interface
           //But it is better if you want it for Custom class
           //Otherwise Comparator is all good
           
           Collections.sort(studs);
           studs.forEach(System.out::println);
        
    }
    
}
