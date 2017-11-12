package oop.Person;

public class Student extends Person{
	// instance variable specific to Student
	private String program;
	
	// The default constructor
	public Student()
	{
		super(); //from person
		program = "Not Specified";
	}
	
	// Constructor with two arguments
	public Student(String theName, String theId)
	{
		super(theName, theId);
		program = "Not specified";
	}
	
	// Constructor with three arguments
	public Student(String theName, String theId, 
			String theProgram)
	{
		super(theName, theId);
		program = theProgram;
	}
	
	public void setProgram(String theProgram)
	{
		program = theProgram;
	}
	
	public String getProgram()
	{
		return program;
	}
	
	// override the toString method for this object
	public String toString()
	{
		return "Student[" + getName() + " : " + 
			getId() + " : " + getProgram() + "]";
	}
	
}
