package parking.student;
import parking.core.* ;

	public class StudentPermit extends ParkingPermit{

	protected String department;

	public StudentPermit(String plateNo, ParkingZone zone, int d, int m, int y,String dept){

	super(plateNo,zone,d,m,y);
	this.department = dept;
	}

	public int studentFee() {
		return 600;
	}

	public void printStudent() {
	super.printBasic();
	System.out.println("Student : "+ department);

	}

}