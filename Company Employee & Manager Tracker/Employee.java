public class Employee{

	private String empId  ;
	private String name ;
	private double salary ;
	private Address address;
	private static int totalEmployee = 0 ;
	private static int counter = 0 ;

	public Employee (String name, double salary, Address address) {

	this.name = name ;
	this.salary = salary ;
	this.address = address ;

	}

	public void EmployeeDetails() {
	
	System.out.printf("ID : e%03d \n" , counter++ ) ;
	System.out.println("Name : " + name);
	System.out.println("Address : " + address);
	System.out.println("Salary : " + salary);
	System.out.println("Total Staff : " + ++totalEmployee);

	}

	public void display() {
	
	System.out.println("---Employee Details---");
	System.out.println("");
	System.out.printf("ID : e%03d \n" , counter++ ) ;
	System.out.println("Name : " + name);
	System.out.println("Address : " + address);
	System.out.println("Salary : " + salary);
	System.out.println("Total Staff : " + ++totalEmployee);
	System.out.println("");
	System.out.println("----------------------------------");

	}

}