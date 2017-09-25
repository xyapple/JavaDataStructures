package collection;
import java.util.*;


public class Student {
    public String id;
    public String name;
    
    public Set courses;
    
    /*Constructor */
    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
    
}
