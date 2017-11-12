package classes;

import javax.swing.JOptionPane;

public class Employee {
	//instance name, startSalary, and timeEmployed
	private String name;
	private int startSalary;
	private double timeEmployed;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the startSalary
	 */
	public int getStartSalary() {
		return startSalary;
	}
	/**
	 * @param startSalary the startSalary to set
	 */
	public void setStartSalary(int startSalary) {
		this.startSalary = startSalary;
	}
	/**
	 * @return the timeEmployed
	 */
	public double getTimeEmployed() {
		return timeEmployed;
	}
	/**
	 * @param timeEmployed the timeEmployed to set
	 */
	public void setTimeEmployed(double timeEmployed) {
		this.timeEmployed = timeEmployed;
	}
	
	//other methods perform operations on Employee data
	   public double getCurrentSalary()
	   {
		   double result;
		   result = startSalary + startSalary*0.04*timeEmployed;
	       return result;
	   }
	   
	   public void printEmployeeData()
	   {
	      JOptionPane.showMessageDialog(null,
	         "Employee " + name + 
	         "\n started with a salary of $" + getStartSalary() + 
	         "\n" + getTimeEmployed() + " years ago and has a" + 
	         "\n current salary of $" + getCurrentSalary());  
	   }
	

	
}
