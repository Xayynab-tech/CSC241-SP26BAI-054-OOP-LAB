public class Manager extends Employee {

	private double bonus ;
	private int teamSize ;

	public Manager(String name, double salary, Address address , double bonus, int teamSize ) {

	super(name,salary,address) ;
	this.bonus = bonus ;
	this.teamSize = teamSize ;
	}
	
	@Override 
	public void display() {
	
	
	System.out.println("---Manager Details---");
	System.out.println("");
	EmployeeDetails() ;

	System.out.println("Bonus : " + bonus ) ;
	System.out.println("Team Size : " + teamSize ) ;
	System.out.println("");
	System.out.println("----------------------");
	}

}