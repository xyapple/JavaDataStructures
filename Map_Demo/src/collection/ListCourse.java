package collection;
import java.util.*;

public class ListCourse {
    //store courses
    public List courseToselect;
    
    public ListCourse(){
        this.courseToselect = new ArrayList();
    }
    // add course to courseToselect
    public void courseAdd(){
        Course course1 = new Course("1", "Data Strature");
        courseToselect.add(course1);
        Course temp = (Course) courseToselect.get(0);
        System.out.println("Course ID: "+ temp.id +" name: " +temp.name+"Had been added.");
        
        Course course2 = new Course("2", "Python 101");
        courseToselect.add(0,course2);
        Course temp2 = (Course) courseToselect.get(0);
        System.out.println("Course ID: "+ temp2.id +" name: " +temp2.name+"Had been added.");
    
        courseToselect.add(course1);
        Course temp0 = (Course) courseToselect.get(2);
        System.out.println("Course ID: "+ temp0.id +" name: " +temp0.name+"Had been added.");
    
        // this is not allow
       /* Course course3 = new Course("3", "Java 101");
        courseToselect.add(5,course3);*/
       
       /* another way to add courses */
       Course[] courses = {new Course("3", "Java 101"),
                            new Course("4", "Java 102")};
       courseToselect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) courseToselect.get(3);
        Course temp4 = (Course) courseToselect.get(4);
        System.out.println("Add Two Courses at once "+ "Course ID: "+temp3.id+","+
                " name: " +temp3.name+","+ "Course ID: "+ temp4.id+"," +" name: "+temp4.name+" Had been added.");
    
          /* another way to add courses */
        Course[] courses2 = {new Course("5", "Interview 101"),
                new Course("6", "Interview 102")};
        courseToselect.addAll(2,Arrays.asList(courses2));
        Course temp5 = (Course) courseToselect.get(2);
        Course temp6 = (Course) courseToselect.get(3);
        System.out.println("Add Two Courses at once "+ "Course ID: "+temp5.id+","+
                " name: " +temp5.name+","+ "Course ID: "+ temp6.id+"," +" name: "+temp6.name+" Had been added.");
    
    }
    
    /***
     *  Get elements
     * @param
     */
    public void courseGet(){
        int size = courseToselect.size();
        for(int i = 0; i <size; i++){
            Course cr = (Course) courseToselect.get(i);
            System.out.println("Courses: " + cr.id +" " + cr.name);
            
        }
    }
    
    public static void main(String[] args) {
        ListCourse t = new ListCourse();
        t.courseAdd();
        t.courseGet();
    }
}
