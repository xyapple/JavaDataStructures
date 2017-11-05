package collection;


/***
 * Course Class
 */
public class Course {
    public String id;
    public String name;
    
    /*Constructor */
    public Course(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Course(){
    
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){return false;}
        if(!(obj instanceof Course)){
            return false;

        }
        Course course = (Course)obj;
        if(this.name == null){
           if(course.name == null){
               return true;
           } else {
               if(this.name.equals(course.name)){
                   return true;
               } else {
                   return false;
               }
           }
        }
        return true;
    
    }
}
