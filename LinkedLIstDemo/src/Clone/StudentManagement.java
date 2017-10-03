package Clone;

import java.io.IOException;
import java.util.*;

/**
 * HW 4 Clone
 */
public class StudentManagement {
    
    private static SinglyLinkedList<Student> stlist = new SinglyLinkedList<>();
    private static Scanner userInput = new Scanner(System.in);
    public static boolean valid = false;
    
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Student management system ");
        displayUserMenu();
    }
    
    /**
     * Display user menu for user to choose
     */
    private static void displayUserMenu() throws IOException {
        // user choice for student menu
        int userChoice = 0;
        System.out.println("1. Add a Student.");
        System.out.println("2. Remove a Student. ");
        System.out.println("3. Update student GPA. ");
        System.out.println("4. Display a student information. ");
        System.out.println("5. Display all students. ");
        System.out.println("6. Exit");
        
        do {
            
            if (userInput.hasNextInt()) {
                userChoice = userInput.nextInt();
                //In order for user not to skip the next line!
                userInput.nextLine();
            } else {
                System.out.println("Number not entered, try again");
                // discarded bad input
                userInput.next();
                
            }
            //check valid selection
            if (userChoice < 1 || userChoice > 6) {
                System.out.println("Please enter number from 1 to 6.");
                
            }
            switch (userChoice) {
                case 1:
                    
                    addStudent();
                    
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateGPA();
                    break;
                case 4:
                    findStudent();
                case 5:
                    displayAll();
                case 6:
                    System.out.println("GoodBye!");
                    System.exit(0);
                    break;
            }
        }
        while (userChoice != 6);
    }
    
    
    /**
     * Add Student method
     */
    
    public static void addStudent() throws IOException {
        
        // Enter User Name
        
        
        System.out.println("Enter Student Name: ");
        String name = userInput.nextLine();
        if (name.equals("")) {
            System.out.println("Name cannot be empty.");
            displayUserMenu();
        }

// Enter User ID
        
        
        System.out.println("Enter Student ID: ");
        String studentID;
        do {
            studentID = userInput.nextLine();
            if (!studentID.equals("")) {
                valid = true;
            } else {
                System.out.println("Student ID cannot be empty. Try Again: ");
                valid = false;
            }
            SinglyLinkedList<Student> newSList1 = new SinglyLinkedList();
            if(newSList1.isEmpty()){
                try {
                    newSList1 = stlist.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
            
            while(newSList1.head != null){
                if (studentID.equals(newSList1.head.getElement().getStudentID())) {
                    System.out.println("Student ID " + studentID + " had been in the system.");
                    displayUserMenu();
                    break;
                }
                newSList1.head = newSList1.head.getNext();
            }
            
        } while (!valid);

//Enter User email
        
        
        System.out.println("Enter Student email: ");
        String email = userInput.nextLine();
        
        // Enter User age
        
        
        System.out.println("Enter Student age: ");
        int age = 0;
        do {
            
            if (userInput.hasNextInt()) {
                age = userInput.nextInt();
                userInput.nextLine();
                if (age > 0 && age < 120) {
                    valid = true;
                    
                } else {
                    System.out.println("Student Age cannot be negative number or 0 or larger than 120 old. Try to enter agian:");
                    valid = false;
                }
                
            } else {
                System.out.println("Student Age must be a number. Try again: ");
                userInput.nextLine();
                valid = false;
                
            }
            
        } while (!valid);
        
        // Enter User Major
        
        
        System.out.println("Enter Student major: ");
        String major = userInput.next();


// Enter User GPA
        
        System.out.println("Enter Student GPA: ");
        double gpa = 0.0;
        do {
            if (userInput.hasNextDouble()) {
                gpa = userInput.nextDouble();
                userInput.nextLine();
                
                if (gpa >= 0.0 && gpa <= 4.0) {
                    valid = true;
                } else {
                    System.out.println("Student GPA cannot be  be negative number or larger than 4. Try Again: ");
                    valid = false;
                }
            } else {
                System.out.println("Student GPA must be a number. Try again: ");
                userInput.nextLine();
                valid = false;
            }
            
        } while (!valid);
        
        
        // Create student
        Student student = new Student(name, studentID, email, age, major, gpa);
    
        stlist.addFirst(student);
        
        displayUserMenu();
    }
    
    
    /**
     *  Remove Student
     */
    private static void removeStudent() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
        if (stlist.isEmpty()) {
            System.out.println("There are no student info, please enter student data, by menu choice 1");
            displayUserMenu();
        }// Check to see if the student ID is in the system
        
        boolean valid = false;
        //prompt user to enter id
        System.out.println("Enter Student ID which you would like to remove from system :  ");
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
        
        SinglyLinkedList<Clone.Student> newSList2 = new SinglyLinkedList();  //create a new linked list newSList2
        SinglyLinkedList<Clone.Student> newSList2D = new SinglyLinkedList();  //create a new linked list newSList2D
        //Clone the newSlist2
        try {
            newSList2 = stlist.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Check to see if the student ID is in the system
        //add the new head into the newSList2D
        while (newSList2.head != null) {
            if (!(studentID.equals(newSList2.head.getElement().getStudentID()))) {
                newSList2D.addFirst(newSList2.head.getElement());
            }else{
                System.out.println("Student ID " + studentID + " had been removed. ");
            }
            newSList2.head = newSList2.head.getNext();
        }
        //Clone the newSlist2D to stlist
        try {
            stlist=newSList2D.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //System.out.println(studentList);
        
        displayUserMenu();
    }
    
    
    
    /**
     * Update Student GPA method
     */
    private static void updateGPA() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
        if (stlist.isEmpty()) {
            System.out.println("There are no student info, please enter student data, by menu choice 1");
            displayUserMenu();
        }
        boolean valid = false;
        
        //prompt user to enter id
        System.out.println("Enter Student ID which you would like to update GPA : ");
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
            newSList3 = stlist.clone();
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
                System.out.println("Enter a New Student GPA for student ID : " + studentID);
                double gpa = 0.0;
                do {
                    if (userInput.hasNextDouble()) {
                        gpa = userInput.nextDouble();
                        userInput.nextLine();
                        
                        if (gpa >= 0.0 && gpa <= 4.0) {
                            valid = true;
                        } else {
                            System.out.println("Student GPA cannot be  be negative number or larger than 4. Try Again: ");
                            valid = false;
                        }
                    } else {
                        System.out.println("Student GPA must be a number. Try again: ");
                        userInput.nextLine();
                        valid = false;
                    }
                    
                } while (!valid);
                //update user gpa
                newSList3.head.getElement().setGpa(gpa);
                System.out.println("Student ID " + studentID + " GPA had been updated." );
            }
            newSList3.head = newSList3.head.getNext();
            
        }
        displayUserMenu();
        
    }
    
    /**
     * find student/display one student
     */
    private static void findStudent() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
        if (stlist.isEmpty()) {
            System.out.println("There are no student info, please enter student data, by menu choice 1");
            displayUserMenu();
        }
        boolean printInfo = false;
        
        boolean valid = false;
        //prompt user to enter id
        System.out.println("Enter Student ID which you would like to review : ");
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
        
        SinglyLinkedList<Student> newSList4 = new SinglyLinkedList();//Create a new list newSList4
        //Clone the studentList into newSList4
        try {
            newSList4 = stlist.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        while (newSList4.head != null) {
            //Iterating through the SinglyLinkedList
            if (studentID.equals(newSList4.head.getElement().getStudentID())) {
                System.out.println(newSList4.head.getElement().printStudent());
                printInfo = true;
                break;
            }
            newSList4.head = newSList4.head.getNext();
        }
        
        if (!printInfo) {
            System.out.println("No student with the given Student ID.");
        }
        displayUserMenu();
        
    }
    
    
    /**
     * display all students
     */
    private static void displayAll() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
        if (stlist.isEmpty()) {
            System.out.println("There are no student info, please enter student data, by menu choice 1");
            displayUserMenu();
        }
        
        System.out.println("Number of students currently in the list is: " + stlist.size());
        
        //create a new list newSList5
        SinglyLinkedList<Student> newSList5 = new SinglyLinkedList();
        //Crone the studentList into newSList5
        try {
            newSList5 = stlist.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        while (newSList5.head != null) {
            System.out.println(newSList5.head.getElement().printStudent());
            newSList5.head = newSList5.head.getNext();
        }
        
        displayUserMenu();
    }
    
    /**
     *
     * Clone the each students
     */
    public static SinglyLinkedList<Student> copyStudentList(SinglyLinkedList<Student> studentList) {
        //create a copystudentlist
        SinglyLinkedList<Student> studentListClone = new SinglyLinkedList<>();
    
        //check it the studentList is null or not
        if (studentList.head == null)
            studentListClone.head = null;
       else {
            studentListClone = new SinglyLinkedList<Student> (new SinglyLinkedList());
        }
       /* //create a tem list to store all the student info
        SinglyLinkedList<Student> temList1 = new SinglyLinkedList<>();
        //create a tem list to store all the student info
        SinglyLinkedList<Student> temList2 = new SinglyLinkedList<>();
        try {
            temList1 = studentList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        try {
            temList2 = studentList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        while(temList1.head != null){
           
            studentListClone.addFirst(temList1.first());
            temList1.head = temList1.head.getNext();
       }
        while(temList2.head != null){
        
            studentListClone.head.setNext(studentListClone.head);
            temList2.head = temList2.head.getNext();
        }
        */
        
        return studentListClone;
       
   
    }
    
    
}
