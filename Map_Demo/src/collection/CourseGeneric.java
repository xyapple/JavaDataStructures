package collection;
import java.util.*;

public class CourseGeneric {
    /*
    * Generate Course, List
    * */
    public List<Course> courses;
    public CourseGeneric(){
        this.courses = new ArrayList<>();
    }
    public void testAdd(){
        Course cr1 = new Course("1", "Math 101");
        courses.add(cr1);
        //courses.add("let's add something");
        Course cr2 = new Course("2", "Math Java 123");
        courses.add(cr2);
    }
    public void testForEach(){
        for(Course cr: courses){
            System.out.println(cr.id + " : " + cr.name);
        }
    }
    
    public static void main(String[] args) {
        CourseGeneric cg = new CourseGeneric();
        cg.testAdd();
        cg.testForEach();
        
    }
}
