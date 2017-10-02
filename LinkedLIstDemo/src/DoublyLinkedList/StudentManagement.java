package DoublyLinkedList;

import java.io.IOException;
import java.util.Scanner;

public class StudentManagement {
    private static DoublyLinkedList<Student> studentList = new DoublyLinkedList<Student>();
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
                   // findStudent();
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
    
    private static void addStudent() throws IOException{
        //Enter User Name
        System.out.println("Enter Student Name: ");
        String name = userInput.nextLine();
        if(name.equals("")){
            System.out.println("Name cannot be empty: ");
            displayUserMenu();
        }
        
        //Enter User ID
        System.out.println("Enter Student ID: ");
        String studentID;
        do {
            studentID = userInput.nextLine();
            if (studentID.equals("")) {
                valid = true;
            } else {
                System.out.println("Student ID cannot be empty. Try again: ");
            }
            //check to see if student ID is not the system or not
           while(studentList.first() != null){
            if(studentID.equals(studentList.first().getStudentID())){
                System.out.println("Student ID " + studentID + " had been in the system.");
                displayUserMenu();
                break;
            }
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
    
        studentList.addFirst(student);
    
        System.out.println("Student ID " + studentID+ " has been Added. ");
        displayUserMenu();
    }
    /**
     *  Remove Student
     */
    private static void removeStudent() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
        if (studentList.isEmpty()) {
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
        
        // Check to see if the student ID is in the system
       while(studentList.first() != null){
           if(studentID.equals(studentList.first().getStudentID())){
               studentList.removeFirst();
           }
           //studentList.addLast(studentList.first());
       }
       
        //System.out.println(studentList);
        
        displayUserMenu();
    }
    /**
     * Update Student GPA method
     */
    private static void updateGPA() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
        if (studentList.isEmpty()) {
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
        boolean contain = false;
        if(studentID.equals(studentList.first().getStudentID())){
            contain = true;
        }
        while (studentList.first() != null) {
            //if the studentID is != to head element, put it into the newSList3D List
            if (!(studentID.equals(studentList.first().getStudentID()))) {
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
                studentList.first().setGpa(gpa);
                System.out.println("Student ID " + studentID + " GPA had been updated." );
            }
            
        }
        displayUserMenu();
        
    }
    
    
    /**
     * display all students
     */
    private static void displayAll() throws IOException {
        //check to see if the studentList is empty, if it is then return menu
        if (studentList.isEmpty()) {
            System.out.println("There are no student info, please enter student data, by menu choice 1");
            displayUserMenu();
        }
    
        System.out.println("Number of students currently in the list is: " + studentList.size());
    
        //Loop through the list
        while (studentList.first() != null) {
            System.out.println(studentList.first().printStudent());
        }
    
        displayUserMenu();
    }
}