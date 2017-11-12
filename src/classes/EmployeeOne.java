package classes;

public class EmployeeOne {
	public static void main(String[] args) {
		//create first employee
		Employee first = new Employee();
		first.setName("A");
		first.setStartSalary(50000);
		first.setTimeEmployed(1);
		//first.printEmployeeData();
		
		//create second employee
		Employee second = new Employee();
		second.setName("B");
		second.setStartSalary(100000);
		second.setTimeEmployed(2);
		
		

		System.out.println(first.getName() + " , " +first.getStartSalary()+ " , "+first.getTimeEmployed() +", "
						 +second.getName()+ " , "+second.getStartSalary() + " , "+second.getTimeEmployed());
		
		System.out.println(first.equals(second));
//		first.printEmployeeData();
//		second.printEmployeeData();
		
		
		
	}

}
