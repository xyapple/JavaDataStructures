package oop.Person;

public class Faculty extends Person {
	// instance variables specific to Faculty
		private String title;
		private String department;
		
		// The default constructor
		// implicit super() as the first call
		public Faculty()
		{
			title = "None";
			department = "Not specified";
		}
		
		// Constructor with two arguments
		public Faculty(String theName, String theId)
		{
			super(theName, theId);
			title = "None";
			department = "Not specified";
		}
		
		// Constructor with three arguments
		public Faculty(String theName, String theId, 
				String theTitle)
		{
			super(theName, theId);
			title = theTitle;
			department = "Not specified";
		}	
		
		// Constructor with four arguments
		public Faculty(String theName, String theId, 
				String theTitle, String theDepartment)
		{
			super(theName, theId);
			title = theTitle;
			department = theDepartment;
		}	

		public void setTitle(String theTitle)
		{
			title = theTitle;
		}
		
		public String getTitle()
		{
			return title;
		}

		public void setDepartment(String theDepartment)
		{
			department = theDepartment;
		}
		
		public String getDepartment()
		{
			return department;
		}

		// override the toString method for this object
		public String toString()
		{
			return "Faculty[" + getName() + " : " + getId() + 
				" : " + getTitle() + " : " +
				getDepartment() +  "]";
		}

}
