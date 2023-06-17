/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrydemo;

/**
 *
 * @author bada5
 */
public class StudentList {
    public static void main(String[] args){
        
        Student s1 = new Student("s0", "Kim");
        
        Student[] studentList = new Student[4];
        // change 10 --> 5
        
        studentList[0] = s1;
        studentList[1] = new Student("s1", "Ronak");
        studentList[2] = new Student("s2", "NewName");
        studentList[3] = new Student("s3", "NewName");
        studentList[4] = new Student("s4", "Ronak");
       
        
        for (int i=0;i < studentList.length - 1; i++ ){
            System.out.println(studentList[i].getsName());
        }
        
        
    }
    
}
