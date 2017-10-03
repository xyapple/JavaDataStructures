package Clone;


import Clone.Person;

//The Student class is a subclass of Person
public class Student extends Person{
    private String studentID;
    private String major;
    private double gpa;
    
    public Student(String name, String studentID, String email, int age, String major,
                   double gpa ) {
        super(name, email, age);
        assert gpa >= 0 && gpa <= 4.0;
        this.studentID = studentID;
        this.major = major;
        this.gpa = gpa;
    }
    
    public String getStudentID(){
        return this.studentID ;
    }
    
    public String getMajor(){
        return this.major;
    }
    public double getGpa(){
        return this.gpa;
    }
    public void setStudentID(String newStudentID){
        this.studentID = newStudentID;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setGpa(double gpa){
        if(gpa >= 0 && gpa <= 4.0){
            this.gpa = gpa;
        }else{
            System.out.println("GPA can only between 0.0 to 4.0.");
        }
    }
    
    
    public String printStudent()
    {
        
        return "\nName: " + getName() + "\nStudent ID: "+getStudentID() +  "\nEmail: " + getEmail() + "\nAge: " + getAge() + "\nMajor: " + getMajor()+"\nGPA: "+getGpa();
    }
    
    public String toString() {
        
        return  printStudent();
        
    }
}
