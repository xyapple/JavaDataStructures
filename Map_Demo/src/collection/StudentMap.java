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
     * Delete student through Map
     */
    public void studentRemoveMap(){
        System.out.println("Please enter student ID that you wanted to removed: ");
       
        while(true){
            //get student id though user input
            Scanner input = new Scanner(System.in);
            String ID = input.next();
            Student st = student.get(ID);
            if(st == null){
                System.out.println("Student ID is not in system: ");
                continue;
            }
            student.remove(ID);
            System.out.println("Student had been removed: "+ st.name);
            break;
        }
    }
    
    /**
     * Map entrySet to loop through Map
     */
    public void studentEntrySet() {
        Set<Map.Entry<String, Student>> entrySet = student.entrySet();
        for(Map.Entry<String, Student> entry: entrySet){
            System.out.println("we get key "+ entry.getKey());
            System.out.println("we get value " + entry.getValue().name);
        }
    }
    /**
     * Update Map
     */
    public void studentModify(){
        System.out.println("Please enter ID that you want to modify: ");
        Scanner input = new Scanner(System.in);
        while(true){
            
            String ID = input.next();
            Student st = student.get(ID);
            if (st == null) {
                System.out.println("Id is not in the system, try again: ");
            continue;
            }
            System.out.println("Current student is: " + st.name);
            System.out.println("Please enter new student name: ");
            String name = input.next();
            Student newStudent = new Student(ID, name);
            //use put()
            student.put(ID, newStudent);
            System.out.println("Success");
            break;
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
        //sm.studentRemoveMap();
        //
        sm.studentModify();
        sm.studentEntrySet();
        
    }
    
    
}
