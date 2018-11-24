/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings.Section9StringsAndUserInput;

/**
 *
 * @author Lucky_Rathod
 */
class Student{
    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

    @Override
    public String toString() {
        
        return "Student{" + "rollno=" + rollno + ", sname=" + sname + '}';
    }
    
    
    
    
}
public class ToStringMethod {
    
    public static void main(String[] args) {
        
        Student s1 = new Student(11,"Lucky");
        System.out.println("rollno : " + s1.rollno+ " sname : " + s1.sname);
        
        //Now when we only print object then it will print hash value
        //Ever class extends Object class 
        //when we print object then it jumps for toString() in class 
        //If it cannot find then it will jump in Superclass Object 
        //where it is defined in which hash value is written
        //There fore to have your own toString 
        //Override it in class 
        //  System.out.println(s1);   ------->      object hash value is printed before OVERRIDING toString()
        System.out.println(s1);
    }
    
}


