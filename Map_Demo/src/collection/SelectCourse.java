package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SelectCourse {
    
    public List<Course> courseToselect;
    
    public SelectCourse(){
        courseToselect = new ArrayList<>();
        
    }
    public void courseAdd(){
        Course course1 = new Course("1", "Data Strature");
        courseToselect.add(course1);
        Course temp = (Course) courseToselect.get(0);
        System.out.println("Course ID: "+ temp.id +" name: " +temp.name+"Had been added.");
        
        Course course2 = new Course("2", "Python 101");
        courseToselect.add(0,course2);
        Course temp2 = (Course) courseToselect.get(0);
        System.out.println("Course ID: "+ temp2.id +" name: " +temp2.name+"Had been added.");
        
        Course[] courses = {new Course("3", "JS 101"), new Course("4", "Python 102")};
        courseToselect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) courseToselect.get(2);
        Course temp4 = (Course) courseToselect.get(3);
    }
    
    public void courseForEach() {
        System.out.println("Here are the Courses (ForEach)：");
        for (Object obj : courseToselect) {
            Course cr = (Course) obj;
            System.out.println("Course：" + cr.id + ":" + cr.name);
        }
    }
    public void courseListContains(){
        //get the first head
        Course course = courseToselect.get(0);
        System.out.println("get course " + course.name);
        System.out.println("current course: " + course.name+","+courseToselect.contains(course));
        //get new course
        Course course2 = new Course(course.id,course.name);
        System.out.println("nee course: "+course2.name);
        System.out.println("current course: " + course2.name+","+courseToselect.contains(course2));
    }
    
    public static void main(String[] args) {
        SelectCourse sc = new SelectCourse();
        sc.courseAdd();
        //sc.courseForEach();
        sc.courseListContains();
        
        //create a student
/*        Student student = new Student("1", "Tim");
        System.out.println("Student: " + student.name + " selected courses: ");
    
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i <3; i++){
            System.out.println("Please enter a course ID: ");
            String courseId = input.next();
            for(Course cr : sc.courseToselect){
                if(cr.id.equals(courseId)){
                    student.courses.add(cr);
                    *//**
                     * Set中，添加某个对象，无论添加多少次， 最终只会保留一个该对象（的引用）， 并且，保留的是第一次添加的那一个
                     *//*
                    // student.courses.add(null);
                    student.courses.add(cr);
                }
            }
        }*/
        //sc.courseForEachPrint(student);
    }
    public void courseForEachPrint(Student student){
        System.out.println("Total number of selected: " + student.courses.size()+" course! ");
        for(Course cr:student.courses){
            System.out.println("Selected Courses: " + cr.id + " : " + cr.name);
        }
    }
    
}
