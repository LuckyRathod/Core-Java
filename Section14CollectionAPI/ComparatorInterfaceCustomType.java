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
class Student{
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    
    //Now if we directly print object then hash value will be printed 
    ///to overcome that we need to override toString()
    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", marks=" + marks + '}';
    }
    
    
}
public class ComparatorInterfaceCustomType {
    
    public static void main(String[] args) {
        
       //Now we will be adding all object of Student in List
       
       List<Student> studs = new ArrayList<>();
       
       studs.add(new Student(1,55));
        studs.add(new Student(2,45));
         studs.add(new Student(3,65));
          studs.add(new Student(4,35));
           studs.add(new Student(5,95));
//           
//           studs.forEach(System.out::println);
           
           
           //Now we will sort these based on marks
           //Meaning we will make marks with highest no as 1
           //Lowest at end
           //We will make use of Anonymous and Lambda expression
           Collections.sort(studs,(s1,s2)->{
               
               return s1.marks>s2.marks?-1:s1.marks < s2.marks?1:0;
               
           });
           
           studs.forEach(System.out::println);
           
           
           //Now these is the one method that we can use to define our own logic 
           //for comparison
           
           //We can also use Comparable interface
          
    }
    
}
