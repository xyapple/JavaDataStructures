package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMap {
    /*
    * Add Students through Map(HashMap)
    *
    * */
    public Map<String,Student> student;
    
    //Constructor
    public StudentMap(){
        this.student = new HashMap<>();
    }
    
    //Create Student ID, Check if there are duplicate student ID
    public void AddStudent(){
        Scanner input = new Scanner(System.in);
        int i = 0;
        //add 3 students
        while(i<3){
            System.out.println("Please enter student ID: ");
            String ID = input.next();
            
            //check if the student ID had been used
            Student st = student.get(ID);
            if(st == null){
                System.out.println("Please enter student name: ");
                String name = input.next();
                //create a new student
                Student newStudent = new Student(ID,name);
                //Put() from Map class
                student.put(ID, newStudent);
                System.out.println("Succueful added: " + student.get(ID).name);
                i++;
            } else {
                System.out.println("Student ID had been used!");
                continue;
            }
        }
        
    }
    
    /**
     * Map keySet()
     * @param
     */
    public void studentKeySet(){
        // keySet method will return all the Keys from Map's set
        Set<String> keySet = student.keySet();
        System.out.println("Total students: " + student.size());
        //
        for (String studentId : keySet) {
            Student st = student.get(studentId);
            if(st != null){
                System.out.println("Student: "+st.name);
            }
        }
    }
    
    public static void main(String[] args) {
        StudentMap sm = new StudentMap();
        sm.AddStudent();
        sm.studentKeySet();
    
    }
    
    
}
