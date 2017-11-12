package classes;

public class EmployeeOne {
	public static void main(String[] args) {
		//create first employee
		Employee first = new Employee();
		first.setName("A");
		//first.printEmployeeData();
		
		//create second employee
		Employee second = new Employee();
		second.setName("B");
		
		first = second;
		//first.getName();
		//second.getName();
		System.out.println(first.getName() + second.getName());
		
		
	}

}
