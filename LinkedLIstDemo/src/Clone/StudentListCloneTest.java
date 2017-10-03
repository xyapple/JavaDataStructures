package Clone;

import java.io.IOException;
import java.util.Scanner;

public class StudentListCloneTest extends StudentManagement{
    public static Scanner userInput = new Scanner(System.in);
   public static SinglyLinkedList<Student> studentList = new SinglyLinkedList<>();
   public static SinglyLinkedList<Student> studentListClone = new SinglyLinkedList<>();
   
    public static void main(String[] args) {
        Student student1 = new Student("Santiago", "1", "sn@java.it", 31, "cs", 1);
        Student student2 = new Student("Sebastián", "2", "se@java.it", 29, "cis", 2);
        Student student3 = new Student("Matías", "3", "ma@java.it", 24, "sd", 3);
        Student student4 = new Student("Nicolás", "4", "ni@java.it", 37, "cis", 4);
        Student student5 = new Student("Alejandro", "5", "al@java.it", 46, "sd", 5);
        studentList.addFirst(student1);
        studentList.addFirst(student2);
        studentList.addFirst(student3);
        studentList.addFirst(student4);
        studentList.addFirst(student5);
        
        studentListClone= copyStudentList(studentList);
       
        System.out.println("studentList " + studentList);
        System.out.println("studentListClone " + studentListClone);
        
        //Update user Age
        try {
            updateAge();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    private static void updateAge() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
       
        boolean valid = false;
        
        //prompt user to enter id
        System.out.println("Enter Student ID which you would like to update Age : ");
        String studentID = "";
        do {
            studentID = userInput.nextLine();
            
            if (!studentID.equals("")) {
                valid = true;
            } else {
                System.out.println("Student ID cannot be empty. Try Again: ");
                valid = false;
            }
        } while (!valid);
        
        // Check to see if the student ID is in the system
        
        //Loop through the studentList to see if there is studentID
        SinglyLinkedList<Student> newSList3 = new SinglyLinkedList();  //create a new linked list newSList3
        SinglyLinkedList<Student> newSList3D = new SinglyLinkedList();  //create a new linked list newSList3D
        //Clone the newSlistD
        try {
            newSList3 = studentList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Check to see if the student ID is in the system
        //add the new head into the newSList2D
        while (newSList3.head != null) {
            //if the studentID is != to head element, put it into the newSList3D List
            if (!(studentID.equals(newSList3.head.getElement().getStudentID()))) {
                
                newSList3D.addFirst(newSList3.head.getElement());
                System.out.println("Student ID "+ studentID + " is not in the system.");
                
            }else{
                //prompt user to enter GPA
                System.out.println("Enter a New Student Age for student ID : " + studentID);
                int age = 0;
                do {
                    if (userInput.hasNextInt()) {
                        age = userInput.nextInt();
                        userInput.nextLine();
                        
                        if (age > 0 && age <= 120) {
                            valid = true;
                        } else {
                            System.out.println("Student Age cannot be  be negative number or larger than 120. Try Again: ");
                            valid = false;
                        }
                    } else {
                        System.out.println("Student Age must be a number. Try again: ");
                        userInput.nextLine();
                        valid = false;
                    }
                    
                } while (!valid);
                //update user age
                newSList3.head.getElement().setAge(age);
                System.out.println("Student ID " + studentID + " age had been updated." );
            }
            newSList3.head = newSList3.head.getNext();
            
        }
    
        System.out.println("studentList " + studentList);
        System.out.println("studentListClone " + studentListClone);
    }
    
}
